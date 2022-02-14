import java.util.Scanner;
public class EvenDemo
{
 
 public static int number(int num) {
 Scanner count = new Scanner(System.in);
 System.out.println("Enter the number");
 num = count.nextInt();
 return num;
}


 public static boolean even(int num) {
 if(num % 2 == 0){
 return true;
}else{
 return false;
}

}

 public static void main(String arg[]){
  
  
  System.out.println(even(number()));
}


}