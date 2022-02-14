import java.util.*;
class Employee{   //POJO
    public String empName, department;
    public int empID, salary;

    public Employee(int empID, String empName, String department, int salary){
        this.empID = empID;
        this.empName = empName;
        this.department = department;
        this.salary = salary;
    }

    public String toString(){
        return "Employee ID-- " + empID + " Employee Name-- " + empName + " Department-- " + department + " Salary-- " + salary;
    }
}


class HashSetUserDemo{
    public static void main (String [] args){
        HashSet <Employee> tObj = new HashSet <Employee>();
        Employee emp = new Employee(1001, "Azad", "R&D", 41000);
        tObj.add(emp);
        tObj.add(new Employee(1004, "Vivan", "IT", 40000));
        tObj.add(new Employee(1007, "RadheShyam", "Managment", 35000));
        tObj.add(new Employee(1009, "Meddy", "Production", 37000));

        System.out.println("Size of the TreeSet is: " + tObj.size());

        Iterator iObj = tObj.iterator();
        System.out.println("===*** List Of TrreSet Elemnts***===");
        while(iObj.hasNext()){
            System.out.println(iObj.next());
        }
    }
}