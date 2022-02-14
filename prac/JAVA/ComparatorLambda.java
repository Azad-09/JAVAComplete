import java.util.*;
class Employee 
{
    int empid,salary;
    String empname,empdept;
    Employee(int empid,String empname,String empdept,int salary)
    {
        this.empid=empid;this.empname=empname;
        this.empdept=empdept;this.salary=salary;
    }
    public String toString()
    {
        return empid+"\t"+empname+"\t"+empdept+"\t"+salary;
    }   
}
class empidComp implements Comparator
{
public int compare(Object a,Object b)
{
Employee e1=(Employee)a;
Employee e2=(Employee)b;
if(e1.empid>e2.empid){ return 1;}
    else if(e1.empid<e2.empid){ return -1;}
    else{ return 0; }
}
}

class empnameComp implements Comparator
{
    public int compare(Object a,Object b)
{
Employee e1=(Employee)a;
Employee e2=(Employee)b;
return e1.empname.compareTo(e2.empname);
}
}

class empsalComp implements Comparator
{
public int compare(Object a,Object b)
{
Employee e1=(Employee)a;
Employee e2=(Employee)b;
if(e1.salary>e2.salary){ return 1;}
    else if(e1.salary<e2.salary){ return -1;}
    else{ return 0; }
}
}

import java.util.*;
class ComparatorLambda {
    public static void main(String[] args) 
    {
      ArrayList<Employee1> hs=new ArrayList<>();
       hs.add(new Employee(2005,"Jivan","SALES",15000));
       hs.add(new Employee(2003,"Mayur","IT",25000));
       hs.add(new Employee(2004,"Akash","HR",35000));
       hs.add(new Employee(2001,"Pruthvi","HRHEAD",45000));
       hs.add(new Employee(2002,"Richard","ITHEAD",35000));
       System.out.println("Employee List without Sorting");
       Iterator i=hs.iterator();
       while(i.hasNext()){ System.out.println(i.next());}
        
       Collections.sort(hs,new empidComp());
      
       System.out.println("Employee List with Sorting--EMPID");
       Iterator j=hs.iterator();
       while(j.hasNext()){ System.out.println(j.next());}


       Collections.sort(hs,new empsalComp());
      
       System.out.println("Employee List with Sorting--EMPSALARY");
       Iterator k=hs.iterator();
       while(k.hasNext()){ System.out.println(k.next());}


      Collections.sort(hs,new empnameComp());
      
       System.out.println("Employee List with Sorting--EMPName");
       Iterator b=hs.iterator();
       while(b.hasNext()){ System.out.println(b.next());}
    }
}

