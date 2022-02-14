interface K
{
String greet(String name);
}
class FunctionaInterface{
public static void main(String[] args)    
{
K obj=(n)-> "Hello "+n+" Welcome to JAVA 8 topics  ";
System.out.println(obj.greet("Shruti"));
}
}