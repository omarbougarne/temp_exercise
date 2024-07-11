package temp;

import java.util.Scanner;
public class Temp{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter first number");
    int number1 = scanner.nextInt();
    System.out.print("Enter second number");
    int number2 = scanner.nextInt();
    int temp;
    temp = number1;
    number1 = number2;
    number2 = temp;
    System.out.print(number1 + "\t" + number2);
    scanner.close();
  }
}
