import java.util.Scanner;
class CirclRad
{
public static void main (String[] args)
{
 int radius;
 double area; 

 Scanner scan = new Scanner(System.in);
 System.out.println("Enter the radius of circle");
 radius = scan.nextInt();

 area = 3.14*(radius*radius);

System.out.println("The Area and the circle with radius " + radius + " is: " + area);

}
}
 


 



