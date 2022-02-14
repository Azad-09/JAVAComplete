class MethodOverloading
{
void marks(int a,int b){System.out.println("Marks of Math and Science "+(a+b));}
void marks(int a,int b,int c){System.out.println("Marks of Social and Economics "+(a+b));}
void marks(double a,int b){System.out.println("Marks of English and Bio "+(a+b));}
void marks(int a,double b){System.out.println("Marks of English and Literature "+(a+b));}

}

class StaticPoly
{
public static void main(String[] args)
{
MethodOverloading obj=new MethodOverloading();
obj.marks(78,60);
obj.marks(45,70,89);
obj.marks(74.2,93);
obj.marks(78,60.3);
}
}