import java.util.Scanner;

public class Factorial {
  public static void main(String[] args) {
      int n;
      try (Scanner scanner = new Scanner(System.in)) {
          System.out.print("Enter a non-negative integer: ");
          n = scanner.nextInt();
      }

    int factorial = 1;
    for (int i = 1; i <= n; i++) {
      factorial *= i;
    }

    System.out.println("The factorial of " + n + " is " + factorial);
  }
}
