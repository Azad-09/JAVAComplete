class StudentDetail{
    private String student_name;
    private int student_Id;
    private int student_std;

public String getName(){
    return student_name;
}

public int getID(){
    return student_Id;
}

public int getStd(){
    return student_std;
}

public String setName(String n){
    n = student_name;
}

public int setId(int ID){
    ID = student_Id;
}

public int setStd(int std){
    std = student_std;
}

}

class DetailStud{

    StudentDetail std1 = new StudentDetail();
    String name = std1.getName();
        name.setName("Osama Bin Laden")
    int standard = std1.getStd();
        standard.setStd(3);
    int rollNo = std1.getID();
        rollNo.setId(27);
    System.out.print("Name of the student: " + name + "\n" + " Standard: " + standard + "\n" + " Student ID: " + rollNo);

    StudentDetail std2 = new StudentDetail();
    String name1 = std2.getName();
        name1.setName("Dawood Ibrahim"); 
    int standard1 = std2.getStd();
        standard1.setStd(4);
    int rollNo1 = std2.getID();
        rollNo1.setId(18);
    System.out.print("Name of the student: " + name1 + "\n" + " Standard: " + standard1 + "\n" + " Student ID: " + rollNo1);


}