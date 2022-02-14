import java.util.*;
class TreeSetDemo{
    public static void main (String [] args){
        TreeSet <String> tObj = new TreeSet <String> ();
        tObj.add("Radhe");
        tObj.add("Azad");
        tObj.add("Chintu");
        tObj.add("Kapil");
        tObj.add("Sidhu");

        System.out.println("Number of Elements of TreeSet: " + tObj.size());
       // tObj.remove("Azad");
        tObj.add("Shruti");
        System.out.println("Number of Elements of TreeSet: " + tObj.size());
        System.out.println("===*** Traveersing The TreeSet ***===");
        Iterator iObj = tObj.iterator();
        while(iObj.hasNext()){
            System.out.println(iObj.next());  // It will print in an sorted manner as it comes under the sortedSet Interface
        }
    }
}


// Number of Elements of TreeSet: 5
// ===*** Traveersing The TreeSet ***===
// Azad
// Chintu
// Kapil
// Radhe
// Sidhu
// Ankits-MacBook-Air:prac maverick$ 

// Alphabetic Order
