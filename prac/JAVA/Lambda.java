import java.util.*;
class Employee{
    private int empID, salary;
    private String empName, dept;

    // getter 
    public int getID(){
        return empID;
    }

    public int getSalary(){
        return salary;
    }

    public String getEmpName(){
        return empName;
    }

    public String getDept(){
        return dept;
    }

    // constructor

    public Employee(int empID, String empName, String dept, int salary){
        this.empID = empID;
        this.empName = empName;
        this.dept = dept;
        this.salary = salary;
    }

    public String toString(){
        return "Employee ID: " + empID + " Employee Name: " + empName + " Department: " + dept + "\n" + " Salary: " + salary;
    }
}

class Lambda{
   public static void main (String [] args){
        LinkedList <Employee> aObj = new LinkedList <> ();
    aObj.add(new Employee(1001, "Azad", "R&D", 90000));
    aObj.add(new Employee(1008, "Rahul", "Marketing", 40000));
    aObj.add(new Employee(1002, "Joel", "Production", 50000));
    aObj.add(new Employee(1004, "Ekka", "Sales", 55000));

    System.out.println("Without Shorting Traversing\n");
    Iterator iObj = aObj.iterator();
    while(iObj.hasNext()){
        System.out.println(iObj.next());
    }

    System.out.println("\nShorting Employee ID:\n ");
    aObj.sort((n1, n2) -> (n1.getID() - n2.getID()));
    aObj.forEach((s) -> System.out.println(s));

    System.out.println("\nShorting Employee Name:\n ");
    aObj.sort((na1, na2) -> (na1.getEmpName().compareTo(na2.getEmpName())));
    aObj.forEach((s) -> System.out.println(s));

    System.out.println("\nShorting Employee Salary:\n ");
    aObj.sort((sa1, sa2) -> (sa2.getSalary() - sa1.getSalary()));
    aObj.forEach((sa) -> System.out.println(sa));
   }

}

    
// 



    //   System.out.println("Before Sorting the student data:"); 
    //  studentlist.forEach((s)->System.out.println(s));
    //   System.out.println("After Sorting the student data by Age:"); 
    //   studentlist.sort((Student s1, Student s2)->s1.getAge()-s2.getAge()); 
    //   studentlist.forEach((s)->System.out.println(s));         
    //   System.out.println("After Sorting the student data by Name:");      
    //   studentlist.sort((Student s1, Student s2)->s1.getName().compareTo(s2.getName())); 
    //   studentlist.forEach((s)->System.out.println(s));        
    //   System.out.println("After Sorting the student data by Id:");        
    //   studentlist.sort((Student s1, Student s2)->s1.getId()-s2.getId()); 
    //   studentlist.forEach((s)->System.out.println(s)); 