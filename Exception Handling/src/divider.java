import java.util.Scanner;

public class divider {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("User enter num 1: ");
    int num1 = scanner.nextInt();
    System.out.print("User enter num 2: ");
    int num2 = scanner.nextInt();

    try{
      int result = num1/num2;
      System.out.println(result);
    } catch (ArithmeticException exception){
      System.out.println("num 2 cannot be 0 because I cannot divide by 0" );
    }
}
}