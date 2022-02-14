import java.util.Scanner;
public class DoubleDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int value = sc.nextInt();
        System.out.println(conversion(value));
        
        
    }

    
    public static long conversion(long num) {
         if (num == 0){
            return 0;
        }else{
           return conversion(num / 10) * 100 + (num % 10) * 10 + num % 10;
        }
    }

    }

