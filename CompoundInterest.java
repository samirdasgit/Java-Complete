import java.util.Scanner;

public class CompoundInterest {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the principal amount: ");
    double principal = scanner.nextDouble();

    double rate = 5.0;

    double interestForFirstYear = (principal * rate) / 100;
    double interestForSecondYear = ((principal + interestForFirstYear) * rate) / 100;
    double interestForThirdYear = ((principal + interestForFirstYear + interestForSecondYear) * rate) / 100;

    System.out.println("Interest for the first year: " + interestForFirstYear);
    System.out.println("Interest for the second year: " + interestForSecondYear);
    System.out.println("Interest for the third year: " + interestForThirdYear);

    scanner.close();
  }
}