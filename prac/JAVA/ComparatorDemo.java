import java.util.*;

class Employee {
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

    
}

// ID
class IdComp implements Comparator {
    public int compare(Object a , Object b){
        Employee e1 = (Employee) a;
        Employee e2 = (Employee) b;

        if(e1.empID > e2.empID ){
            return 1;
        }else if(e1.empID < e2.empID){
            return -1;
        }else{
            return 0;
        }
    }
}

// Name
class nameComp implements Comparator{
    public int compare(Object a , Object b){
        Employee e1 = (Employee) a;
        Employee e2 = (Employee) b;

        if(e1.empName.compareTo(e2.empName) > 0 ){ 
            return 1;
        }else if(e1.empName.compareTo(e2.empName) < 0){
            return -1;
        }else{
            return 0;
        }
    }
}


// Dept.
class deptComp implements Comparator{
    public int compare(Object a , Object b){
        Employee e1 = (Employee) a;
        Employee e2 = (Employee) b;

        if(e1.dept.compareTo(e2.dept) > 0 ){
            return 1;
        }else if(e1.dept.compareTo(e2.dept) < 0){
            return -1;
        }else{
            return 0;
        }
    }
}


// Salary
class salaryComp implements Comparator{
    public int compare(Object a , Object b){
        Employee e1 = (Employee) a;
        Employee e2 = (Employee) b;

        if(e1.salary > e2.salary ){
            return 1;
        }else if(e1.salary < e2.salary){
            return -1;
        }else{
            return 0;
        }
    }
}

class ComparatorDemo{
    public static void main (String [] args){
       ArrayList<Employee> lObj = new ArrayList<>();
       lObj.add(new Employee(2005,"Jivan","SALES",15000));
       lObj.add(new Employee(2003,"Mayur","IT",25000));
       lObj.add(new Employee(2004,"Akash","HR",35000));
       lObj.add(new Employee(2001,"Pruthvi","HRHEAD",45000));
       lObj.add(new Employee(2002,"Richard","ITHEAD",35000));
       System.out.println("Employee List without Sorting\n");
       ListIterator noSo = lObj.listIterator();
       while(noSo.hasNext()){
           System.out.println(noSo.next());
       } 
       
       System.out.println("\nEmployee List After ID Sorting\n");

       Collections.sort(lObj, new IdComp());
       ListIterator IDSo = lObj.listIterator();
       while(IDSo.hasNext()){
           System.out.println(IDSo.next());
        }   
        
       System.out.println("\nEmployee List After Name Sorting\n");

        Collections.sort(lObj, new nameComp());
       ListIterator naSo = lObj.listIterator();
       while(naSo.hasNext()){
           System.out.println(naSo.next());
        }

       System.out.println("\nEmployee List After Department Sorting\n");

       Collections.sort(lObj, new deptComp());
       ListIterator depSo = lObj.listIterator();
       while(depSo.hasNext()){
           System.out.println(depSo.next());
        }

       System.out.println("\nEmployee List After Salary Sorting\n");

        Collections.sort(lObj, new salaryComp());
       ListIterator slSo = lObj.listIterator();  //traversing
       while(slSo.hasNext()){
           System.out.println(slSo.next());
        }
        System.out.println("\n===========================================================\n");
        System.out.println(lObj.get(0));
        System.out.println(lObj.get(1));
        System.out.println(lObj.get(2));

    }
}