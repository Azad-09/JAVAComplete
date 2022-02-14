public class Fact{

    public static int factorial (int num){
    if(num == 1)
        return 1;
        return num * factorial(num -1);
    
}

    public static void main (String[] arg){
        System.out.println(factorial(6));
    }
}