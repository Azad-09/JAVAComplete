
import java.util.*;
interface Evenodd{
void check (int a);
}
public class LamdaDemo1{
public static void main (String[] args){
  Evenodd evenodd=(int a)->{ 
		if(a%2==0){
			System.out.println("Number"+a+"is Even");
		}
		else{
			System.out.println("Number"+a+"is odd");
			}
		};
evenodd.check(50);
evenodd.check(15);
}
}