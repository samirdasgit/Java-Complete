import java.util.*;

public class Power {
  public static void main(String Args[]) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Base Number: ");
    long x = input.nextInt();
    System.out.print("Enter Power Number: ");
    long n = input.nextInt();
    long number = power(x, n);
    System.out.printf("The Result is: %d", number);
    input.close();
  }

  static long power(long x, long n) {
    long result = 1;
    for (int i = 1; i <= n; i++) {
      result *= x;
    }
    return result;
  }
}
