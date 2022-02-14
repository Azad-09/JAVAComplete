import java.util.Scanner;
public class Grade {
    public static void main (String [] arg){
      String grade = dispGrade();
      System.out.println(grade);
    }

    public static int calcMarks() {
        Scanner sc = new Scanner (System.in);
        int marks;
        int totMarks = 0;
        System.out.println("Enter the marks of all 5 Subjects of Semester 1");
        for(int i = 1;i<=5;i++){
            marks = sc.nextInt();

            if(marks < 0 || marks > 100){
                System.out.println("The mark entered is less than 0 or greater than 100. Please type the correct mark");
                marks = sc.nextInt();
            }

            totMarks = totMarks + marks;
        }
        return totMarks;
    }

    public static float calcAvg(){
        int sum = calcMarks();
        System.out.println("Sum of all the marks of Semester 1 is: " + sum);
        return (sum /5);
    }

    public static String dispGrade(){
        float avgMark = calcAvg();
        System.out.println("Average of all the marks is: " + avgMark);
       
        if(avgMark > 80){
            return "Grade is A";
        }else if(avgMark >=79 && avgMark <= 60){
            return "Grade is B";
        }else if(avgMark>= 59 && avgMark<= 50){
            return "Grade is C";
        }else if(avgMark>=49 && avgMark<=35){
            return "Grade is D";
        }else{
            return "Grade is F";
        }
    //  String all = (avgMark > 80)? "Grade is A" : (avgMark >=79 && avgMark <= 60) ? "Grade is B" : (avgMark>= 59 && avgMark<= 50)? "Grade is C" : (avgMark>=49 && avgMark<=35)? "Grade is D" : "Grade is F" ;

     
    }


}