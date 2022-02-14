import java.util.*;
import java.io.*;
class Emp1
{
int empid;String empname,empdept;
Emp1(int empid,String empname,String empdept)
{
    this.empid = empid;
    this.empname = empname;
    this.empdept = empdept;
}
}
class DemoList
{
public static void main(String[] args) throws IOException
{
    List<Emp1> liobj=new ArrayList<>();
BufferedReader br=new BufferedReader(new FileReader("EmpData.txt"));
String line="";
while((line=br.readLine())!=null)
{
    String[] data1=line.split(" ");
liobj.add(new Emp1(Integer.parseInt(data1[0]),data1[1],data1[2]));
}
System.out.println("Print Data in my List");
for(Emp1 x:liobj)
{
    System.out.println("EMPID--"+x.empid+"\tEMPNAME--"+x.empname+"\tEMPDEPT--"+x.empdept);
}
}
}