import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.err.println("Enter your full name: ");
    Scanner inputTool = new Scanner(System.in);
    String userName = inputTool.nextLine();
    System.out.println("You entered: "+userName);
    inputTool.close();
  }
}