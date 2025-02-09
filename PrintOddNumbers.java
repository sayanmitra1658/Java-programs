import java.util.Scanner;

public class PrintOddNumbers {
  public static void main(String[] args) {
      int num;
      try (Scanner scanner = new Scanner(System.in)) {
          System.out.print("Enter a number: ");
          num = scanner.nextInt();
      }

    System.out.println("Odd numbers from 1 to " + num + ":");
    for (int i = 1; i <= num; i++) {
      if (i % 2 != 0) {
        System.out.print(i + " ");
      }
    }
  }
}
