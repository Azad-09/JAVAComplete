import java.util.Scanner;
public class GreaterSmaller{
    public static void main (String[] args){
        int max = 0;
        int min = 0;
      
        int arr[] = new int[7];
        Scanner sc = new Scanner(System.in);
        for(int index = 0; index < 7; index++){
            System.out.println("Enter the number");
            arr[index] = sc.nextInt();

        if(arr[index] > max){
            max = arr[index];
        }
        else if(arr[index] < max ) {
            min = arr[index];
        }
        }

       
     
         
        System.out.println("Greatest number is: " + max);
        System.out.println("Smallest number is: " + min);

           

      

    }

         
    }



    
          

