import java.util.*;

public class arraySequence{
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        String[] words = new String[size];
        System.out.println("Enter the elements of the array");
        for(int i = 0; i < words.length; i++ ){
           words[i] = sc.nextLine();
        }
        String sort = sorted(String[] words);
        System.out.println(sort);
    }

    public static String[] sorted(String[] words){
        String temp = "null";
        for(int i = 0; i < words.length; i++){
            //return (words[i]);
            for(int j = i+1; j < words.length; j++ ){
                temp = words[i];
		words[i] = words[j];
		words[j] = temp;
            }
        }
        return words;
    }
}