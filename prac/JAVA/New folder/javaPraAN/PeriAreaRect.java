import java.util.Scanner;
class PeriAreaRect
{
public static void main (String[] args)
{
 int length, breadth, peri, area ;
 
 Scanner scan = new Scanner(System.in);
 System.out.println("Enter the length of Rectangle");
 length = scan.nextInt();
 System.out.println("Enter the breadth of Rectangle");
 breadth = scan.nextInt();
 
 peri = 2 * (length + breadth);
 area = length * breadth;

System.out.println("The Area and Perimeter of the Rectangle with length " + length + " and breadth " + breadth + " is " + area + " and " + peri);
 
}
}
 


 



