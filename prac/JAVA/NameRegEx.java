import java.util.*;
import java.util.regex.*;

public class NameRegEx{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name:");
        String name = sc.nextLine();
        String pattern = "[A-Z][\\w+][\\s][\\w+]";

        Pattern pt = Pattern.compile(pattern);
        Matcher mt = pt.matcher(name);
        
       if(mt.find()){
           System.out.println("YourNameIsPerfectlyTyped");
       }else{
           System.out.println("Try Again !!! .. Against Protocol");
       }
    }
}