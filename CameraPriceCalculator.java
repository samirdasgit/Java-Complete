import java.util.Scanner;

public class CameraPriceCalculator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the printed price: ");
    double price = sc.nextDouble();

    double discountPrice = price * 0.10; // 10% discount
    double finalAmount = discountPrice * 1.06; // 6% GST on discounted price

    System.out.println("Amount to be paid: " + finalAmount);
  }
}