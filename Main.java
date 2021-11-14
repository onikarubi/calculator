import java.util.Scanner;

public class Main {
  public static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    Calc plus = new Plus();
    plus.ArithmeticOperations(plus);
    // scanner.close();

    // int count = 0;

    // String[] str;

    // String rVal = scanner.nextLine();

    // str = rVal.split(" ");

    // count += Integer.parseInt(str[0]);

    // for (int i = 0; i < str.length; i++) {
    //   if (i % 2 == 1) {
    //     switch (str[i]) {
    //     case "+":
    //       count += Integer.parseInt(str[i + 1]);
    //       break;

    //     case "-":
    //       count -= Integer.parseInt(str[i + 1]);
    //       break;

    //     case "*":
    //       count *= Integer.parseInt(str[i + 1]);

    //     case "/":
    //       count /= Integer.parseInt(str[i + 1]);

    //     default:
    //       break;
    //     }
    //   }
    // }
    // System.out.println(count);



    scanner.close();
  }
}
