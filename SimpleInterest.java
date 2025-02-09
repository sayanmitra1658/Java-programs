import java.util.Scanner;

public class SimpleInterest {
  public static void main(String[] args) {
      double principal;
      double rate;
      int years;
      try (Scanner scanner = new Scanner(System.in)) {
          System.out.print("Enter the principal amount: ");
          principal = scanner.nextDouble();
          System.out.print("Enter the rate of interest (in %): ");
          rate = scanner.nextDouble();
          System.out.print("Enter the number of years: ");
          years = scanner.nextInt();
      }

    System.out.println("Simple Interest for each year:");
    for (int i = 1; i <= years; i++) {
      double interest = (principal * rate * i) / 100;
      System.out.println("Year " + i + ": " + interest);
    }
  }
}
