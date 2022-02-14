import java.io.*;

class One{
   public static void main (String [] args){
        try{
    File file = new File("Azad.txt");
    file.createNewFile();

    }
    catch(Exception e){
        System.out.println("Not a file");
        System.out.println(e);
    }
   }
}