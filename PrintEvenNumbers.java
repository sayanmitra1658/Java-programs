import java.util.Scanner;

public class PrintEvenNumbers {
  /**
   * @param args
   */
  public static void main(String[] args) {
      int num;
      try (Scanner scanner = new Scanner(System.in)) {
          System.out.print("Enter a number: ");
          num = scanner.nextInt();
      }

    System.out.println("Even numbers from 1 to " + num + ":");
    for (int i = 2; i <= num; i += 2) {
      System.out.print(i + " ");
    }
  }
}
