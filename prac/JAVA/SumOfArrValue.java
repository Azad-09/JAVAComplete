// sum of all the values in an array

public class SumOfArrValue{

    public static void main (String [] args){

        System.out.println(arrSum());
    }

    public static int arrSum(){
        int sum = 0;
        int[] arr = {1, 14, 13, 22, 20, 71};
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        return sum;

    }
}