class StudentMain
    {
    public static void main(String[] args)
    {
        String[] sName = {"Azad", "Radhe", "Dawood", "Osama"};
        int[] rollNo = {101, 102, 103,104};
        int[] maths = {87, 24, 58, 89};
        int[] science = {65, 43, 52, 98};
        int[] english = {55,45,61,66};
        int[] social = {74, 45, 40, 84};
        int[] totalMarks = {492, 235,320, 336};
        int[] averageTotalMarks = {95, 45, 59, 67 };
        int[] passFailStatus = {1, 0, 1, 1 };
        int[] studentIndex = {1, 0, 1, 1};

        EvaluationAndGrading marks = new EvaluationAndGrading(maths, science, english, social, studentIndex);

        System.out.println("Total Marks of each student");
        marks.calculateTotalMarks(maths, science, english,  social);
        for(int i=0;i<totalMarks.length;i++)
        {
            System.out.print(totalMarks[i]+" ");
        }
        System.out.println(" ");
       
        marks.calculateAverageTotalMarks(totalMarks);
       
        System.out.println("Total marks of maths="+marks.calculateAverage_englishMarks (maths));
        System.out.println("Total marks of science="+marks.calculateAverageScienceMarks (science));
        System.out.println("Total marks of social="+marks.calculateAverageSocialMarks (social));
        System.out.println("Total marks of english="+marks.calculateAverage_englishMarks(english));

        Report_Generation reports = new Report_Generation( );
        System.out.println("Top Scorer ="+reports.findTopScorer(totalMarks, sName));
        reports.isPassed(maths, science, social,  english);
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