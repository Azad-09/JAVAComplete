import java.util.*;
class LinkedListDemo
{  
    public static void main(String[] args)
     {
       List<String> liobj=new LinkedList<>();
        liobj.add(new String("Dell"));
        liobj.add(new String("HP"));
        liobj.add(new String("Asus"));
    liobj.add(new String("SAMSUNG"));
    System.out.println("Total no of elements--"+liobj.size());
    System.out.println("DISPLAY List items using ListITERATOR class-FORWARD");
          ListIterator j=liobj.listIterator();
          while(j.hasNext()){ System.out.println(j.next());}

    System.out.println("DISPLAY List items using ListITERATOR class-BACKWARD");
    Collections.reverse(liobj);
          ListIterator k=liobj.listIterator();
          while(k.hasNext()){ System.out.println(k.next());}

     }
}
