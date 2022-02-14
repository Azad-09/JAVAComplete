import java.util.*;
class Student
{
    private String name;
    private int roll;
    Student(String name,int roll)
    {
        this.name=name;
        this.roll=roll;
    }
    public String getName()
    {
        return name;
    }
    public int getRoll()
    {
        return roll;
    }
    public String toString()
    {
        return "Student[name:::"+name+",roll:::"+roll+"]";
    }
}
class Node
{
    private Student data;
    private Node next,previous;
    public Node(Student data) {
        this.data = data;
    }
    public void setNext(Node n)
    {
        this.next=n;
    }
    public Student getData()
    {
        return data;
    }
    public Node getNext()
    {
        return next;
    }
     public Node getPrevious(){
        return previous;
    }
    public void setPrevious(Node previous){
        this.previous = previous;
    }
}
 class StudentList {
    Node start;
    Node end;
    public void insert(Student data) //  ------502(EKa)   504(Heba)
    {
       Node newNode = new Node(data);
       Node current = start;
       Node previous = null;
       if(current == null){  // for 1st node = current, start (FILO)
          start = newNode;
          end = newNode;
       }
       else{	
          newNode.setNext(current);  // 2nd current
          //current.setPrevious(newNode);
          start = newNode;   //   start
       }
         }
    public  void Traversal()   // travel within the list AZAD Display
    {
       Node current = start;
       while(current != null)
       {
          System.out.println(current.getData());
          current = current.getNext();  // ++ --
       }
    }

    public boolean delNode(int rollNo) // 501/arun----------502/aarthi-----503/heba---------504/Eka
	{
	Node previous, current;
	previous=null;
        current = start;
        while ((current != null) && (rollNo != current.getData().getRoll()))
		{
		previous = current;
		current = current.getNext();
		}
         	if(current == null)
		{
			return false;
		}
            else
            {		
		if (current == start)
		{
		start = start.getNext();
		}
                else
                   previous.setNext(current.getNext());
		   return true;
         }
	}
    
}
public class LinkedListMain
{
	public static void main(String[] args)
    {    Scanner sc=new Scanner(System.in);
            StudentList list=new StudentList();
            while(true)
            {
                System.out.println("Select an option\n1.Insert\n2.View\n3.Delete\n4.Exit\nEnter your option");
                int option=sc.nextInt();
                switch(option)
                {
                    case 1: System.out.println("Enter name  of a student");
                            sc.nextLine();  //String
                            String name = sc.nextLine();
                            System.out.println("Enter the roll number:");
                            int roll = sc.nextInt();
                            Student s = new Student(name,roll);  
                            list.insert(s);
                            System.out.println("Insertion Successful");
                            break;
                    case 2:list.Traversal(); break;
                    case 3: sc.nextLine();System.out.println("Enter name of a student");
                            String name1=sc.nextLine();
                            System.out.println(list.deleteStudent(name1));break;
                    case 4:  System.exit(0);break;
                    default: System.out.println("Invalid choice");
                }
	}
}
}


