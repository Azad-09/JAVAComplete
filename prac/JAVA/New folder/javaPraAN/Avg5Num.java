import java.util.Scanner;
class Avg5Num
{
public static void main (String[] args)
{
 int num1, num2, num3, num4, num5, avg;
 

 Scanner scan = new Scanner(System.in);
 System.out.println("Enter 1st number");
 num1 = scan.nextInt();
 System.out.println("Enter the 2nd number");
 num2 = scan.nextInt();
 System.out.println("Enter the 3rd number");
 num3 = scan.nextInt();
 System.out.println("Enter the 4th number");
 num4 = scan.nextInt();
 System.out.println("Enter the 5th number");
 num5 = scan.nextInt();

 avg = (num1 + num2 + num3 + num4 + num5) / 5;

System.out.println("The average of this 5 given number is: " + avg);

}
}
 


 



