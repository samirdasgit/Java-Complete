import java.util.Scanner;

public class MultiplyTwoNumbers {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter two numbers: ");
    int number1 = scanner.nextInt();
    int number2 = scanner.nextInt();
    int multiplyValue = number1 * number2;
    System.out.println(multiplyValue);
    scanner.close();
  }
}