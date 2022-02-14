import java.util.*;
import java.util.function.*;

class Student
{
    int sid,mark,deptcode;
    String name,deptname;
    Student(int sid,String name,int mark,String deptname,int deptcode)
    {
     this.sid=sid;
     this.name=name;this.mark=mark;this.deptcode=deptcode;
     this.deptname=deptname;
    }
    public String toString()
    {
        return "[StudentDetail-"+sid+"\t"+name+"\t"+mark+"\t"+deptname+"\t"+deptcode+"]";
    }
}


class EnchancedFuncInterface {   
    public static void main(String[] args) {
       List<Student> list1=new ArrayList<>();
       list1.add(new Student(604,"Heba",89,"CSE",51));
       list1.add(new Student(605,"Arthi",87,"ECE",50));
       list1.add(new Student(601,"Eka",56,"CSE",51));
       list1.add(new Student(602,"Anagha",81,"IT",52));
       list1.add(new Student(603,"Jansi",66,"IT",52));
       System.out.println("Students LIST using CONSUMER interface");
       // For Loop, Enhanced For, Iterator class
       // Consumer Interface, .forEach
       Consumer<Student> data1 = (x) -> System.out.println(x);
       list1.forEach(data1);

        System.out.println("\nStudents LIST----forEach with Lambda\n");
        list1.forEach((y) ->System.out.println(y));

        Supplier<Integer> s1 = () -> (int) (Math.random()*10);
        System.out.println("\n" + s1.get());
        System.out.println(s1.get());

        Supplier<String> s2=()->"CSE";
        // System.out.println(s2.get());

       List<Student> list2=new ArrayList<>();       // arrayList2
       for(Student i:list1)
       {
        if(i.deptname.equals(s2.get())){list2.add(i);}
       }
        System.out.println("Students of CSE dept");
        list2.forEach((y) ->System.out.println(y));

       Predicate <Student> p1 = (k) -> k.name.startsWith("A");
        func1(list1,p1);

    
    public  void func1(List<Student> data2,Predicate<Student> pre)
    {
        System.out.println("Students List--Names startswith A");
    for(Student j:data2)
    {
        if(pre.test(j)){System.out.println(j);}
    }
    }

    
}
}
