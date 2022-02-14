import java.util.*;

class TreeMapDemo{
    public static void main (String [] args){
        TreeMap <Integer, String> tmObj = new TreeMap <> ();
        tmObj.put(1, "Mobile"); 
        tmObj.put(1, "Key");   // OverWrite
        tmObj.put(2, "Laptop"); 
        tmObj.put(3, "Charger"); 
        tmObj.put(4, "Tab"); 
        tmObj.put(5, "Power Bank"); 

        System.out.println("Number of elements in TreeMap: " + tmObj.size());
        System.out.println("Elements at position 1: " + tmObj.get(1));
        tmObj.remove(1);  // It will remove the "Mobile"
        Set keys = tmObj.keySet();
        for(Object k : keys){
            System.out.println("Key Value " + k + " Value is " + tmObj.get(k));
        }
        System.out.println("\n List After Sorting \n");
        Map sortedMap = valueSort(tmObj);
        Set sort = sortedMap.entrySet();
        Iterator i = sort.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        
  

    }
}