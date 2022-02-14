import java.util.Scanner;
public class Fencing{

    
    public static void main (String[] arg){
    
       calcArea();
    }

    public static void calcAreaSquare(int side){
        
    System.out.println("Area of square: " + (side * side));
         
    }

    public static void calcAreaCircle(int radius){
        
     System.out.println("Area of Circle: " +(Math.PI*radius*radius));    
         
    }

    public static void calcAreaRectangle(int length,int breadth){
        
     System.out.println("Area of Rectangle: " + (length * breadth));

        
    }

    public static void calcArea(){
        Scanner sc = new Scanner(System.in);
        int choice;
       
        //write a menu showing the user to choose which shape area he/she wants to calculate
        System.out.println("Select an option from list to calculate area of fence");
        System.out.println("1. Square area for the chickens");
        System.out.println("2. Circular area for ducks");
        System.out.println("3. Rectangular area for cows");

        
        choice = sc.nextInt();

        if(choice == 1){
            System.out.println("Enter side");
            int side = sc.nextInt();
             calcAreaSquare(side);
        }else if(choice == 2){
            System.out.println("Enter radius");
            int radius = sc.nextInt();
             calcAreaCircle(radius);
        }else if(choice == 3) {
            System.out.println("Enter length");
            int len = sc.nextInt();
            System.out.println("Enter breadth");
            int bred = sc.nextInt();
            
            calcAreaRectangle(len,bred);
        }
        //sc.close();
    }
}