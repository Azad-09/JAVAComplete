import java.util.Scanner;
class IncrimentBy7
{
public static void main (String[] args)
{
 int numb;
 
 Scanner scan = new Scanner(System.in);
 System.out.println("Enter the number");
 numb = scan.nextInt();

 numb += 7;

System.out.println("Number after increment by 7 is: " + numb);
 
}
}



