import java.util.Scanner;

public class Grade
 { 
   public static void main(String []args) {      
      
       String totMark = disGrade();
       System.out.println(totMark);
     }  

   public static float calcTotMark(){ 
       Scanner scan =new Scanner(System.in);
       float marks;
       float totalmarks = 0 ;
       System.out.println("Enter the marks of all 5 subjects:");
          for(int i=1;i<=5;i++)
           { 
             marks = scan.nextFloat();
             
             if(marks<0 || marks>100)
              {
                System.out.println("Marks should be in between 0 to 100, Enter the valid marks:");
                 marks = scan.nextFloat();
                 
              }
               totalmarks = totalmarks + marks; 

           }  return totalmarks;
      }

  public static float calculateAvg(){ 
   float sum = calcTotMark();
   System.out.println("Total marks is:"+sum);
   return(sum/5);
 
 } 
 public static String disGrade(){
   float avgmarks = calculateAvg();
   System.out.println("Average marks is:"+avgmarks);
   if(avgmarks>80) 
{
    return "Grade is A";
}
else 
if (avgmarks>=79 && avgmarks<=60)
{
   return "Grade is B";
}
else
 if (avgmarks>=59 && avgmarks<=50)
{
   
    return "Grade is C";
}
else 
if (avgmarks>=49 && avgmarks<=35)
{
   
    return "Grade is D";
}
else
{
   return"Grade is F";
 }  
 } 
}
