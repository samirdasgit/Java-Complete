import java.util.*;

public class DigitalCamera {
  public static void main(String[] args) {
    double p, d, dp, a, gst;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the price:");
    p = sc.nextDouble();
    d = p * 0.10;
    dp = p - d;
    gst = dp * 0.06;
    a = dp + gst;
    System.out.println("Amount to be paid by customer is " + a);
  }
}