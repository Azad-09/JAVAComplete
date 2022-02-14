import java.util.Scanner;
class AddScan
{
public static void main (String[] args)
{
 int num1 , num2, sum;
 
 Scanner scan = new Scanner(System.in);
 System.out.println("Enter the first number");
  num1 = scan.nextInt();
 System.out.println("Enter the second number");
 num2 = scan.nextInt();
 sum = num1 + num2;
System.out.println("Sum of these two number is: " + (num1 + num2));
System.out.print("Sum of " + num1 + " and " + num2 + " is: " + sum);
}
}