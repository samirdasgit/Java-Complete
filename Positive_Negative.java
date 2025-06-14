import java.util.*;

public class Positive_Negative {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter A Number: ");
    int a = input.nextInt();
    check(a);
  }

  static void check(int a) {
    if (a < 0)
      System.out.println("Negative Number.");
    else if (a > 0)
      System.out.println("Positive Number.");
    else
      System.out.println("The Number is Zero.");
  }
}