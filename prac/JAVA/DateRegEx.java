import java.util.*;
import java.util.regex.*;

public class DateRegEx{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter today's Date:");
        String date = sc.nextLine();
        String pattern = "(0[1-9]|| [12][0-9] || 3[01])/(0[1-9]||1[012]/(\\d{4}))";      // 23/07/2012

        Pattern pt = Pattern.compile(pattern);
        Matcher mt = pt.matcher(date);
        
       if(mt.find()){
           System.out.println("Valid date typed");
       }else{
           System.out.println("Try Again!!!");
       }
    }
}