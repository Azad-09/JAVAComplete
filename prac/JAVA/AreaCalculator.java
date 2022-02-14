import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        // Call method to calculate area of fence according to user's choice
        calcArea();
    }

    public static void calcArea(){
      Scanner sc = new Scanner(System.in);
        System.out.println("Select an option from list to calculate area of fence");
        System.out.println("1. Square area for the chickens");
        System.out.println("2. Circular area for ducks");
        System.out.println("3. Rectangular area for cows");
        // Input choice from user
        int choice =sc.nextInt();
        System.out.println(choice);
        if(choice == 1){
          System.out.println("enter side");
          int side = sc.nextInt();
          calcAreaSquare(side);
        }
        else if(choice == 2){
          System.out.println("enter radius");
          int radius = sc.nextInt();
          calcAreaCircle(radius);
        }
        else if(choice == 3){
          System.out.println("enter length");
          int l = sc.nextInt();
          System.out.println("enter breadth");
          int b = sc.nextInt();
          calcAreaRectangle(l, b);
        }
        sc.close();
    }

    public static void calcAreaSquare(int side){
      System.out.println("Area of Square fence of chicken is "+side*side);
    }

    public static void calcAreaCircle(int radius){
      System.out.println("Area of Circular fence "+ 2*Math.PI*radius*radius);
    }

    public static void calcAreaRectangle(int l, int b){
      System.out.println("Area of rectangle is "+l*b);
    }   
}