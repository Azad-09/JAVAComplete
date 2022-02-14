import java.util.Scanner;
public class EvenOdd {
    public static void main (String[]args){
        int countEv = 0;
        int countOd = 0;
        int number[] = {12, 14, 11, 33, 56, 78, 77, 99, 75 , 88};
        for(int index = 0; index < number.length; index++ ){
            if(number[index] % 2 == 0){
                countEv++;
               
            }else{
                countOd++;
            }
        }
        System.out.println("The total number of even numbers in this array is: " + countEv);
System.out.print("The total number of odd number in this array is: " + countOd);
    }
}

