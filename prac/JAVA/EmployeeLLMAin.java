class Employee{
    private int empID;
    private String empName;

    // Parameterised Constructor
    public Employee(int empID , String empName){
        this.empID = empID;
        this.empName = empName;
    }

    public void getEmpID(){
        return empID;
    }

    public void getEmpName(){
        return empName;
    }

    // toString() method

    public String toString(){
        return "Employee ID::: " + empID + " Employee Name::: " + empName; 
    }
}

class Node{
    private Employee data;   // data object of class Student is Instantiated
    private Node next, previous;

    // public Node(Employee data){  // Parameterised Constructor
    //     this.data = data;
    // }

    // getter
    public Employee getData(){
        return data;
    }

    public Node getNext(){
        return next;
    }

    public Node getPrevious(){
        return previous;
    }

    // setter
    public void setData(Employee data){
        this.data = data;
    }

    public void setNext(Node next){
        this.next = next;
    }

    public void setPrevious(Node previous){
        this.previous = previous;
    }

}

class EmployeeList{
    
}