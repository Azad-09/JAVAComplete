public class SumOfNumber{
    public static void main (String args []){
        int numberArray[] = {3,2,5,10,18,44};
        System.out.print(sumArrayValue(int[] numberArray));
    }

    public static int sumArrayValue(int[] numArray){
        int sum = 0;
        for(int i = 0; i < numArray.length; i++){
            sum += numArray[i];
        }
        return sum;
    }
}