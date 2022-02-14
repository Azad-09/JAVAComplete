import java.util.*;

interface EvenOdd{
    void number(int num);

}

class FunctionInterface{
    public static void main (String [] args){
        EvenOdd obj = (num) -> {
            if(num % 2 == 0){
                System.out.println(num + " is a Even Number✌️");
            }else{
                System.out.println(num + " is not a Even Number");
            }
        };

        obj.number(33);
        obj.number(22);

    }
}