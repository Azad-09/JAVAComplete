
import java.util.*;   // Scanner Class

class Demo1
{
public static void main(String[] args){

Scanner sc=new Scanner(System.in);
System.out.println("Enter a Number");
int no=sc.nextInt();
Demo1 obj=new Demo1();
System.out.println(obj.validateNumber(no));

}

public String validateNumber(int x)
{
String result= "";
try
{
if(x>=10)
{ 
    
result = "Valid Number"; 


 }
else  { throw new NumberValidException123(); }    // throw keyword is used to call the user-defined exceptiom class
}
catch(NumberValidException123 e)
{
result = e.toString();
}
return result;
}
}

class NumberValidException123 extends Exception
{
public String toString()
{  return "DOnt enter a Number less than 10";  }
}



throw new CalculatorException("Calculator Exception");

