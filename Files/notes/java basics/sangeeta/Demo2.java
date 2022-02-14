import java.util.Scanner;
class Demo2
{
public static  void main(String[] args)
{  
int no1,no2;  String name;  double mark;
char grade; boolean status;
Scanner scanobj=new Scanner(System.in);
System.out.println("Enter First Number");
no1=scanobj.nextInt();
System.out.println("Enter Second Number");
no2=scanobj.nextInt();
System.out.println("Enter Your Name");
name=scanobj.next();//next()  vs nextLine();
System.out.println("Enter Your Mark");
mark=scanobj.nextDouble();
System.out.println("Enter Your Grade");
grade=scanobj.next().charAt(0);//"hello"
System.out.println("Enter Your Status");
status=scanobj.nextBoolean();
System.out.println("Answer-->"+(no1+no2));
System.out.println("Hello "+name);
System.out.println("Mark  "+mark);
System.out.println("Grade  "+grade);
System.out.println("Status "+status);
}
}










