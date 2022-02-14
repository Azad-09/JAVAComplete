import java.util.*;
import java.util.regex.*;

public class EmailID{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your e-mail ID:");
        String id = sc.nextLine();
        String pattern = "\\w+@{1}.[a-z]+.c[o]m";

        Pattern pt = Pattern.compile(pattern);
        Matcher mt = pt.matcher(id);
        
       if(mt.find()){
           System.out.println("Valid e-mail ID");
       }else{
           System.out.println("Try Again!!!");
       }
    }
}