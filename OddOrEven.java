import java.util.Scanner;

public class OddOrEven {
  public static void main(String[] arg) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the value");
    int a = scanner.nextInt();
    if (a % 2 == 0) {
      System.out.println("This is Even");
    } else {
      System.out.println("This is Odd");
    }
    scanner.close();
  }
}
