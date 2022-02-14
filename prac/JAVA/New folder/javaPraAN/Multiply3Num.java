import java.util.Scanner;
class Multiply3Num
{
public static void main (String[] args)
{
 int num1, num2,num3 ;
 
 Scanner scan = new Scanner(System.in);
 System.out.println("Enter first number");
 num1 = scan.nextInt();
 System.out.println("Enter second number");
 num2 = scan.nextInt();
 System.out.println("Enter third number");
 num3 = scan.nextInt();

 

System.out.println("The product of " + num1 + ", " + num2 + " and " + num3 + " is: " + (num1 * num2 * num3));
 
}
}



