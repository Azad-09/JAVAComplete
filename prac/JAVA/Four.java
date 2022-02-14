class Four{
    public static void main (String [] args){
        try{
             //Arithmetic
        int num1 = 23;
        int num2 = 0;
        System.out.println("Divison: " + (num1 / num2));

        }
        catch(ArithmeticException a){
            System.out.println(a);
            System.out.println("Phir Se Lag gaye");
            
        }
       
    }
}