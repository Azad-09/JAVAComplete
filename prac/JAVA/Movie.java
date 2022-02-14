import java.util.*;
public class UserNamePassword{

  public static void main (String args []){
      Scanner sc = new Scanner(System.in);
      String username, pass, realUser, realPass;
      realUser = "James";
      realPass = "password@123";
      System.out.println("Enter the UserName:");
      username = sc.nextLine();
      System.out.println("Enter the Password:");
      pass = sc.nextLine();
      if(pass.length() < 15){
          if(username.equals(realUser) && pass.equals(realPass)){
              System.out.print("Welcome to this page JAMES");
          }else{
              System.out.print(" Sorry Wrong Person ");
          }
      }
  }

  
}