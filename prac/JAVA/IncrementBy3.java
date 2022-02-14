//Increment by 3
import java.util.*;
public class IncrementBy3{
    public static void main (String[] args){
        int[] array = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array value");
        for(int i = 0; i< array.length; i++){
            array[i] = sc.nextInt();
        } 
        System.out.println("Given array element is: ");
        for(int i = 0; i< array.length; i++){
            System.out.print(array[i] + ",");
        }

        System.out.println();

        System.out.println("Array after Increment: " + increment(array));


    }

    public static int[] increment(int[] arr){
       
        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[i] + 3;
        }

        System.out.println("Array after increment:");
        for(int i = 0; i < arr.length; i ++ ){
            System.out.print(arr[i] + "," );
        }

        return arr;
    }
}