import java.util.*;
class ArrayListDemo{
    public static void main (String [] args){
        // List listObj = new ArrayList();
        List <Number> listObj = new ArrayList <Number>();  // Generic
        listObj.add(20); listObj.add(90); listObj.add(10); 
        // listObj.add("Tiger");
        listObj.add(36.2); listObj.add(9337310049L);
        System.out.println("Size of the ArrayList is: " + listObj.size());
        System.out.println(listObj.get(2));
        listObj.remove(2); 
        System.out.println("Size of the ArrayList is: " + listObj.size());
        Iterator j = listObj.iterator();
        System.out.println("Output of the ArrayList:");
        while(j.hasNext()){
            System.out.println(j.next());
        }

    }
}