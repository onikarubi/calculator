public abstract class Calc {
  public int resultVal;
  public String[] holdVal;
  public String symbol;
  public String calcNum;

  public String[] receiveVal() {
    String receiveVal = Main.scanner.nextLine();
    holdVal = receiveVal.split(" ");
    return holdVal;
  }

  public boolean isInteger(String num) {
    try {
      Integer.parseInt(num);
      return true;
    } catch (NumberFormatException e) {
      return false;
    }
  }

  public void ArithmeticOperations(Calc c) {
    receiveVal();
    c.resultVal += Integer.parseInt(this.holdVal[0]);

    for (int i = 0; i < this.holdVal.length; i++) {
      if (i % 2 == 1) {
        if (this.holdVal[i].equals(this.symbol)) {
          calcNum = c.holdVal[i + 1];
          this.calc(calcNum, c);
        }
      }
    }

    System.out.println(c.resultVal);
  }

  public void fourArithmeticOperations(String symbol) {
    switch (symbol) {
      case "+":
        Calc plus = new Plus();
        plus.calc(calcNum, plus);
        break;

      default:
        break;
    }
  }


  public abstract int calc(String calcNum, Calc c);
}
