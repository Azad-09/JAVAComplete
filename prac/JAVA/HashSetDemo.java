import java.util.*;
class HashSetDemo{
    public static void main (String [] args){
        HashSet <Number> hobj = new HashSet <Number> ();  // Wrapper - Type Inference (in-buit type inference)
        //  hobj.add("RadheShyam");
        hobj.add(987678);
        hobj.add(987678);
        hobj.add(987678); // No Duplication
        hobj.add(0978.45);
        hobj.add(93373100449L);
        System.out.println("Number of Elements in this HashSet is: " + hobj.size()); // It will show 3 elements
        hobj.remove(0978.45);  // No index number is there in SET
        System.out.println("Number of Elements in this HashSet is: " + hobj.size()); // It will show 3 elements
        System.out.println("====***Traversing the HashSet***====");  // It will only show the Unique Element present in the Set
        Iterator iObj = hobj.iterator();
        while(iObj.hasNext()){
            System.out.println(iObj.next());
        }
    }
}