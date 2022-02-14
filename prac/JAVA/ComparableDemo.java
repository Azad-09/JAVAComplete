import java.util.*;

class Employee implements Comparable{
    public int empID, salary;
    public String empName, dept;

    public Employee(int empID, String empName, String dept, int salary){
        this.empID = empID;
        this.empName = empName;
        this.dept = dept;
        this.salary = salary;
    }

    public String toString(){
        return "Employee ID: " + empID + " Employee Name: " + empName + " Department: " + dept + " Salary: " + salary;
    }

    public int compareTo(Object obj){
        Employee e1 = (Employee) obj;
        if(this.empName.compareTo(e1.empName) > 0){
            return 1;
        }else if(this.empName.compareTo(e1.empName) < 0){
            return -1;
        }else{
            return 0;
        }
    }
}


class ComparableDemo{
    public static void main (String [] args){
        ArrayList <Employee> arrObj = new ArrayList <> ();  // User Defined Genereic 
        arrObj.add(new Employee(1001, "Rajesh", "R&D", 35000));
        arrObj.add(new Employee(1008, "Ankur", "Product", 32000));
        arrObj.add(new Employee(1003, "Krishna", "Managment", 40000));
        arrObj.add(new Employee(1005, "Hanuman", "Marketing", 41000));

        System.out.println("List without Sorting\n");
     
        ListIterator i = arrObj.listIterator();
        while(i.hasNext()){
        System.out.println(i.next());
        }
      
        System.out.println("\nList After Sorting\n");
        Collections.sort(arrObj);

        ListIterator j = arrObj.listIterator();
        while(j.hasNext()){
        System.out.println(j.next());
        }

    }
}


// OutPut::

// Lisr without Sorting

// Employee ID: 1001 Employee Name: Rajesh Department: R&D Salary: 35000
// Employee ID: 1008 Employee Name: Ankur Department: Product Salary: 32000
// Employee ID: 1003 Employee Name: Krishna Department: Managment Salary: 40000
// Employee ID: 1005 Employee Name: Hanuman Department: Marketing Salary: 41000

// List After Sorting

// Employee ID: 1001 Employee Name: Rajesh Department: R&D Salary: 35000
// Employee ID: 1003 Employee Name: Krishna Department: Managment Salary: 40000
// Employee ID: 1005 Employee Name: Hanuman Department: Marketing Salary: 41000
// Employee ID: 1008 Employee Name: Ankur Department: Product Salary: 32000

// Here Only The Employee ID is Sorted as Multiple Sorting is Not Allowed **