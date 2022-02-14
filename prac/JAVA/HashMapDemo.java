/*
import java.util.*;
class HashMapDemo{
    public static void main(String [] args){
        HashMap <Integer, String> hmObj = new HashMap <> ();
        hmObj.put(101, "Blue");
        hmObj.put(101, "Black");  // OverWrite
        hmObj.put(102, "Green");
        hmObj.put(103, "Red");
        hmObj.put(104, "Grey");
        hmObj.put(111, "Voilet");
        hmObj.put(106, "Pink");
        hmObj.put(null, "AZAD");
        hmObj.put(null, "GUDDU");
        hmObj.put(107,null);
        hmObj.put(108,null);

        System.out.println("Number of elements in the HashMap: " + hmObj.size());
        System.out.println("\nValue at key 101: " + hmObj.get(101) + "\n"); // It will show that value which is written in last. It go downward search
        hmObj.remove(101);
        System.out.println("Number of elements in the HashMap: " + hmObj.size());
     
        // hmObj.remove(101);
        // Set <Integer> keys = hmObj.keySet();
        // for(Object k : keys ){
        //     System.out.println("Key is " + k + " Value is " + hmObj.get(k));
        // }
        for(Map.Entry<Integer, String> entry : hmObj.entrySet()){
            System.out.println(entry.getKey() + ". " + entry.getValue());

        }

    }
}

*/



import java.util.*;
class HashMapDemo
{
public static void main(String[] args) 
{
    HashMap<Integer,String> hm=new HashMap<>();
    hm.put(105,"Black");hm.put(103,"Red");
    hm.put(101,"White");hm.put(104,"Green");
    hm.put(103,"Blue");//Overwrite
    hm.put(106,"Green");//valid
    System.out.println("Total Elements--"+hm.size());
    System.out.println("value in key 105---"+hm.get(105));
    hm.remove(105);
    Set<Integer> keys=hm.keySet();
    for(Object k:keys)
    {
        System.out.println("Key is--"+k+"---Value is--"+ hm.get(k));
    }
}
}