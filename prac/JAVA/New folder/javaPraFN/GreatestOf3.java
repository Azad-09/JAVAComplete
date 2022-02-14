class GreatestOf3
{
public static void main (String[] args)
{
 int num1 = 5;
 int num2 = 7;
 int num3 = 9;

 if(num1 > num2 && num1 > num3){
 System.out.println(num1 + " is greatest of all");
}else if(num2 > num1 && num2 > num3) {
 System.out.println(num2 + " is greatest of all");
}else{
 System.out.println(num3 + " is the greatest of all");
}
 

}
}