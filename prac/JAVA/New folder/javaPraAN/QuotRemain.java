import java.util.Scanner;
class QuotRemain
{
public static void main (String[] args)
{
 int num1, num2, quot, remain ;
 
 Scanner scan = new Scanner(System.in);
 System.out.println("Enter first number");
 num1 = scan.nextInt();
 System.out.println("Enter second number");
 num2 = scan.nextInt();

 quot = num2 / num1;
 remain = num2 % num1;

System.out.println("When " + num2 + " is divided by "+ num1 + " it will produce Quotient and Remainder equals to " + quot + " and " + remain);
 
}
}
 


 



