//@FunctionalInterface
interface FactorialCalc{
    int factorial(int number);
}

class BLDemo1{
    public static void main (String [] args){
        FactorialCalc obj = (num) -> {
            int result = 1;
            for(int i = 1; i <= num; i++){
                result = i * result; 
            }
            return result;
        };

        System.out.println(obj.factorial(5));
    }
}