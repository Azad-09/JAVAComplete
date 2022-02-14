
class Fibonacci {
 
 public static int fib(int i) {
  if (i == 0) return i;
  if(i <= 2) return 1;
  else
 return fib(i - 1) + fib(i - 2);
 }
 
 public static void main(String args[]) {
  int choice = 0;
  while(true)
	{
  	System.out.println(fib(choice));
         choice++;
  	}
  
 }
};