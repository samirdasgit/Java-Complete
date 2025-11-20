import java.util.Scanner;

public class SimpleCalculater {
  public static void main(String[] arg) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter two number:");
    int num1 = scanner.nextInt();
    int num2 = scanner.nextInt();
    int sum = num1 + num2;
    int difference = num1 - num2;
    int product = num1 * num2;
    int quotient = num1 / num2;
    System.out.println("Sum of two number is " + sum);
    System.out.println("Difference of two number is " + difference);
    System.out.println("Product of two number is " + product);
    System.out.println("Quotient of two number is " + quotient);
    scanner.close();
  }
}
