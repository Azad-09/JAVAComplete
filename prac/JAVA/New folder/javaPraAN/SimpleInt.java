import java.util.Scanner;
class SimpleInt
{
public static void main (String[] args)
{
 int pri, rate, time, si;
 

 Scanner scan = new Scanner(System.in);
 System.out.println("Enter the Principle Amount");
 pri = scan.nextInt();
 System.out.println("Enter the Rate");
 rate = scan.nextInt();
 System.out.println("Enter the Time period");
 time = scan.nextInt();

 si = (pri * rate * time) / 100;

System.out.println("The Simple Interest for this given information is: " + si);

}
}
 


 



