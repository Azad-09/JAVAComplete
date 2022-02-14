import java.util.*;
class Wrapper{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first decimal number:");
        float num1 = sc.nextFloat();
        System.out.println("Enter the second decimal number:");
        float num2 = sc.nextFloat();
        System.out.println(convertion(num1, num2));

    }

    public static String convertion(float n1, float n2){
        float number1 = n1 * 1000;
        float number2 = n2 * 1000;

        int numInt1 = (int) number1;
        int numInt2 = (int) number2;

        if(numInt1 == numInt2){
            return "Both the number are same upto 3 decimal point";
        }else{
            return "Both the number are different, Sorry!!";
        }
    }
}