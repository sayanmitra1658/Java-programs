import java.util.Scanner;

public class MultiplicationTable {
  /**
   * @param args
   */
  public static void main(String[] args) {
      int num;
      try (java.util.Scanner scanner = new Scanner(System.in)) {
          System.out.print("Enter a number: ");
          num = scanner.nextInt();
      }

    extracted(num);
    for (int i = 1; i <= 10; i++) {
      System.out.println(num + " x " + i + " = " + (num * i));
    }
  }

  private static void extracted(int num) {
    System.out.println("Multiplication Table of " + num);
  }
}
