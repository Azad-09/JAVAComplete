import java.util.*;

class Employee{
    private int empID;
    private String empName;

    public Employee(int empID, String empName){    // Parameterised Constructor
        this.empID = empID;
        this.empName = empName;
    }

    // getter
    public int getID(){
        return empID;
    }

    public String getName(){
        return empName;
    }

    // toString()
    public String toString(){
        return "Employee ID:::" + empID + " Employee Name:::" + empName;
    }
}


class Node{
    private Employee data;     // Employee is the class and "data" is the object (We can assign ID and NAME)
    private Node next, previous;

    public Node(Employee data){
        this.data = data;
    }

    // getter
    public Node getNext(){    // Node is the return type here
        return next;
    }

    public Node getPrevious(){
        return previous;
    }

    public Employee getData(){
        return data;
    }

    // setter
    public void setNext(Node next){
        this.next = next;
    }

    public void setPrevious(Node previous){
        this.previous = previous;
    }


}


class EmployeeList{
    public Node start;
    public Node end;

    // Insert
    public void insert(Employee data){  // insert will coloect the information of Employee and dur to which we set the parameter as the constructor of Employee 
        Node newNode = new Node(data);
        Node current = start;
        Node previous = null;

        if(current == null){
            start = newNode;
            end = newNode;
        }else{
            newNode.setNext(current);
            start = newNode;
        }
    }

    // Traverse
    public void traverse(){
        Node current = start;
        while(current != null){
            System.out.println(current.getData());
            current = current.getNext();
        }
    }

    // Deletion
    public boolean deletion(int ID){
        Node previous;
        Node current;
        
        while((current != null) && (ID != current.getData().getID())){
            previous = current;
            current = current.getNext();
        }

        if(current == null){
            return false;
        }else{
            if(current == start){
                start = start.getNext();
            }else{
                previous.setNext(current.getNext());
            }
        }
    }

}


class EmployeeLinkedMain{

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        EmployeeList list = new EmployeeList();

        while(true){
            System.out.println("Please select any One: \n1.Insert\n2.View\n3.Delete\n4.Exit\n\nEnter Your Choice:");
            int choice = sc.nextInt();
            switch(choice){
                case 1: System.out.println("Enter Your Name:");
                        String name = sc.nextLine();
                        System.out.println("Enter Your Employee ID Numebr:");
                        int num = sc.nextInt();
                        Employee empD = new Employee(num, name);
                        list.insert(empD);
                        System.out.println("Insertion Process is Successful");
                        break;

                case 2: list.traverse();
                        break;

                case 3: System.out.println("Enter Your Employee ID Number:");
                        int idNum = sc.nextInt();
                        list.deletion(idNum);  // Non-Static Method Call using object reference
                        System.out.println("Deletion Process is Successful");
                        break;

                case 4: System.exit(0);
                        break;

                default: System.out.println("Invalid Choice!! Please Try Again ");
                         break;

            }
        }
    }
}