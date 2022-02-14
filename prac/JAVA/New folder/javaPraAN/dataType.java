import java.util.Scanner;
class dataType
{
public static void main (String[] args)
{
 double mark; char grade; boolean status; long mobile; String name;
 
 Scanner scan = new Scanner(System.in);
 System.out.println("Enter your name");
 name = scan.next();
 System.out.println("Enter your mobile number");
 mobile = scan.nextLong();
 System.out.println("Enter your %age");
 mark = scan.nextDouble();
 System.out.println("Enter your grade");
 grade = scan.next().charAt(0);
 System.out.println("Are you male?");
 status = scan.nextBoolean();

System.out.println("Your name is: " + name);
System.out.println("your contact number is: " + mobile);
System.out.println("Your %age is: " +  mark + "%");
System.out.println("Your grade is: " + grade);
System.out.println(status);
}
}