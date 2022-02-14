public class GreetingDemo
{

 public static String greet(int time) {

 if(time>=4 && time <= 12){
 return "Good Morning";
} else if(time > 12 && time <= 17){
 return "Good Afternoon";
}else if (time >17 && time <= 20) {
 return "Good Evening";
}else {
 return "Good Night";
}
}

 public static void main(String arg[]){

  System.out.println(greet(13));
}


}