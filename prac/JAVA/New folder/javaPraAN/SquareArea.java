import java.util.Scanner;
class SquareArea
{
public static void main (String[] args)
{
 int side, area ;
 
 Scanner scan = new Scanner(System.in);
 System.out.println("Enter the length of side");
 side = scan.nextInt();
 
 area = side * side; 

System.out.println("The area of the Square with side " + side + " is: " + area);
 
}
}
 


 



