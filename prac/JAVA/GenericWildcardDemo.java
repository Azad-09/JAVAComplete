import java.util.*;
class Student <D>{
    private D studID;
    public Student(D studID){
        this.studID = studID;
    }

    public D getID(){
        return studID;
    }

    public boolean compare(Student <? extends Number> x){
        if(studID == x.studID){
            return true;
        }else{
            return false;
        }
    }
}

class GenericWildcardDemo{
    public static void main (String [] args){
        Student<String> strObj = new Student("1023");
        Student<Integer> intObj = new Student(1023);
        Student<Double> dobObj = new Student(1023);
        // System.out.println(intObj.compare(strObj));  // As it extends the "Number so it will not be equal to String"
        System.out.println(intObj.compare(dobObj));
    }
}