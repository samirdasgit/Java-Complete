import java.util.Scanner;

public class LargestOfThreeNumbers {
  public static void main(String[] arg) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter three number");
    int num1 = scanner.nextInt();
    int num2 = scanner.nextInt();
    int num3 = scanner.nextInt();
    if (num1 > num2 && num1 > num3) {
      System.out.println("First number is Largest");
    } else if (num2 > num1 && num2 > num3) {
      System.out.println("Second number is Largest");
    } else {
      System.out.println(" Third number is Largest");
    }
    scanner.close();
  }
}
