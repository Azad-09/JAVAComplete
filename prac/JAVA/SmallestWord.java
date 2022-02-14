import java.util.*;
public class SmallestWord{
    public static void main (String args []){
        String[] words = new String[5];
        Scanner sc =  new Scanner (System.in);
        System.out.println("Enter the words:");
        for(int i = 0; i < words.length; i++){
        words[i] = sc.nextLine();
        }
        System.out.print("Words:\n" + words(smallest) + "\t");
    }

    public static String smallest(String[] words){
        for(int i = 0 ; i < words.length; i++){
            String shortWord = "";
        int short = words[0].length();
        int next = words[i].length();
            if(short > next){
                shortWord = next[i];
            }
        }
        return shortWord;
    }
}