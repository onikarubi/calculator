public class Plus extends Calc {
  Plus() {
    super();
    this.symbol = "+";
  }

  public int calc(String calcNum, Calc c) {
    c.resultVal += Integer.parseInt(calcNum);
    return c.resultVal;
  }
}



