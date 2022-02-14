import java.util.Scanner;
class Names
{
public static void main (String[] args)
{
 String name1, name2;
 
 Scanner scan = new Scanner(System.in);
 System.out.println("Enter your name");
 name1 = scan.next();
 System.out.println("Enter your friend name");
 name2 = scan.next();



System.out.println("Your name is " + name1 + " and your friend name is " + name2 );

}
}