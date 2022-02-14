
import java.util.*;
 class EvaluationAndGrading
{
    int maths[];
    int science[];
    int english[];
    int social[];
    int language[];
    int total[];
   

      EvaluationAndGrading(int maths[],int science[], int english[], int social[],int language[],int total[])
     {
        this.maths=maths;
        this.science=science;
        this.english=english;
        this.social=social;
        this.language=language;
        this.total=total;
   
       
     }
      int[] calculateTotalMarks(int math[],int science[],int english[], int language[],int social[])
     {    
        int totalMarks[] = new int[math.length];
        for(int i=0; i<math.length;i++)
        {
            totalMarks[i] += (math[i] + science[i]  + english[i] + language[i] + social[i]);
        }
       
        return totalMarks;
     }
   
      int[] calculateAverageTotalMarks(int[] totalMarks)
     {
        int averageTotalMarks[] = new int[totalMarks.length];
        for(int i=0; i<totalMarks.length;i++)
        {
            averageTotalMarks[i]= totalMarks[i]/5;
        }      

        return averageTotalMarks;
     }
     int calculateAverageMathMarks (int[] math)
    {
        int total_math_marks =0;
        int average_math_marks =0;
        for(int i=0; i<math.length; i++)
        {
            total_math_marks+= math[i];
            average_math_marks = total_math_marks/math.length;
        }
       return average_math_marks;
    }
     int calculateAverageScienceMarks (int[] science)
    {
        int total_science_marks =0;
        int average_science_marks =0;
        for(int i=0; i<science.length; i++)
        {
            total_science_marks+= science[i];
           
        }
        average_science_marks = total_science_marks/science.length;
       return average_science_marks;
       
    }
    int calculateAverage_englishMarks (int[] english)
    {
        int total_english_marks =0;
        int average_english_marks =0;
        for(int i=0; i<english.length; i++)
        {
            total_english_marks+= english[i];
            
        }
        average_english_marks = total_english_marks/english.length;
       return average_english_marks;
    }
    int calculateAverageSocialMarks (int[] social)
    {
        int total_social_marks =0;
        int average_social_marks =0;
        for(int i=0; i<social.length; i++)
        {
            total_social_marks+= social[i];
            
        }
        average_social_marks = total_social_marks/social.length;
       return average_social_marks;
    }
    int calculateAverageLanguageMarks (int[] language)
    {
        int total_language_marks =0;
        int average_language_marks =0;
        for(int i=0; i<language.length; i++)
        {
            total_language_marks+= language[i];
            
        }
        average_language_marks = total_language_marks/language.length;
       return average_language_marks;
    }
}

 class Report_Generation
{
   String sName[];
   int maths[];
   int science[];
   int english[];
   int social[];
   int language[];
   
    String findTopScorer(int[] totalMarks,String [] studentNames)
    {
        //return the name of  the top scorer , extract the name from the studentNames array
        String tempTopScorer = studentNames[0];
        int tempTopScorer_marks= totalMarks[0];
        for(int i=1;i<totalMarks.length;i++)
        {
                if(totalMarks[i]>tempTopScorer_marks)
                {
                    tempTopScorer_marks = totalMarks[i];
                    tempTopScorer = studentNames[i];
                }
           
        }
        return tempTopScorer;
    }
     int[] isPassed(int [] math,int science[], int[] social, int[] language,int[] english)
    {
        int pass_or_fail[] = new int[math.length];
        for(int i=0;i<math.length;i++)
        {
            if(math[i]<35 || science[i]<35 || social[i]<35 || language[i]<35 || english[i]<35)
            {
                pass_or_fail[i]=0;
            }
            else
            {
                pass_or_fail[i]=1;
            }
        }
        return pass_or_fail;
    }
     int[] Passed(int [] math,int science[], int[] social, int[] language,int[] english)
    {
        int pass_or_fail[] = new int[math.length];
        for(int i=0;i<math.length;i++)
        {
            if(math[i]<35 || science[i]<35 || social[i]<35 || language[i]<35 || english[i]<35)
            {
                pass_or_fail[i]=0;
            }
            else
            {
                pass_or_fail[i]=1;
            }
        }
        return pass_or_fail;
    }
    String[] listOfStudentsPassedTheExam(int [] studentIndex,String studentNames[])
    {
        String passed[] = new String[studentNames.length];
        int index =0;
        for(int i=0; i<studentIndex.length;i++)
        {
            if(studentIndex[i]==1)
            {
                passed[index]=studentNames[i];
                index++;
            }
        }
        String studentPassedExam[]=Arrays.copyOf(passed,index);
        return studentPassedExam;
    }
public void listOfStudentsToReAppearForExam(int[] passFailStatus, String[] sName2) {
// TODO Auto-generated method stub

}
     
}

 class Survey_and_Statistics
{
    char[] generateGrades(int averageTotalMarks[])
       
    {
        char grade[] = new char[averageTotalMarks.length];
        for(int i=0; i<averageTotalMarks.length;i++)
        {
        if(averageTotalMarks[i]>=90)
        {
            grade[i] = 'A';
        }
        else if(averageTotalMarks[i]>=80)
        {
            grade[i] = 'B';
        }
        else if(averageTotalMarks[i]>=70)
        {
            grade[i] = 'C';
        }
        else if(averageTotalMarks[i]>=60)
        {
            grade[i] = 'D';
        }
        else if(averageTotalMarks[i]>=50)
        {
            grade[i] = 'E';
        }
        else
        {
           grade[i]= 'F';
        }
       
        }
        return grade;
        }

        int[] sortByTotalMarks(int[] totalMarks,int [] rollNos)
        {
        for(int i=0; i<rollNos.length; i++)
        {
            for(int j=0;j<rollNos.length-i-1;j++)
            {
                if(totalMarks[j]>totalMarks[j+1])
                {
                    int tempTotalMarks = totalMarks[j];
                    totalMarks[j] = totalMarks[j+1];
                    totalMarks[j+1] = tempTotalMarks;

                    int temprollNos = rollNos[j];
                    rollNos[j] = rollNos[j+1];
                    rollNos[j+1] = temprollNos;
                }
            }
    }
                     return rollNos;
        }

   
}

class StudentMain
    {
    public static void main(String[] args)
    {
        String[] sName = {"Nisha", "Hari", "Elisa", "Bheem"};
        int[] rollNo = {101, 102, 103,104};
        int[] maths = {87, 24, 58, 89};
        int[] science = {65, 43, 52, 98};
        int[] english = {55,45,61,66};
        int[] social = {74, 45, 40, 84};
        int[] language = {46, 95, 67, 34};
        int[] totalMarks = {492, 235,320, 336};
        int[] averageTotalMarks = {95, 45, 59, 67 };
        int[] passFailStatus = {1, 0, 1, 1 };
        int[] studentIndex = {1, 0, 1, 1};

        EvaluationAndGrading marks = new EvaluationAndGrading(maths, science, english, language, social, studentIndex);

        System.out.println("Total Marks of each student");
        marks.calculateTotalMarks(maths, science, english, language, social);
        for(int i=0;i<totalMarks.length;i++)
        {
            System.out.print(totalMarks[i]+" ");
        }
        System.out.println(" ");
       
        marks.calculateAverageTotalMarks(totalMarks);
       
        System.out.println("Total marks of maths="+marks.calculateAverage_englishMarks (maths));
        System.out.println("Total marks of science="+marks.calculateAverageScienceMarks (science));
        System.out.println("Total marks of social="+marks.calculateAverageSocialMarks (social));
        System.out.println("Total marks of language="+marks.calculateAverageLanguageMarks (language));
        System.out.println("Total marks of english="+marks.calculateAverage_englishMarks(english));

        Report_Generation reports = new Report_Generation( );
        System.out.println("Top Scorer ="+reports.findTopScorer(totalMarks, sName));
        reports.isPassed(maths, science, social, language, english);
        reports.listOfStudentsToReAppearForExam(passFailStatus, sName);
        reports.listOfStudentsPassedTheExam(studentIndex, sName);
       
       Survey_and_Statistics survey = new Survey_and_Statistics();
       
        survey.generateGrades(averageTotalMarks);
       
        System.out.println("Roll No according to marks");
        survey.sortByTotalMarks(totalMarks, rollNo);
        for(int i=0;i<rollNo.length;i++)
        {
            System.out.print(rollNo[i]+" ");
        }
       


    }
}