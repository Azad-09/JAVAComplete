import java.util.*;
import java.sql.*;
public class Task2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, World!");
        
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cars sales data", "root", "Azad@2923");
       
        // Task 2 --Drop AxelRod
        String query2 = "delete from salesPerson where salesId = 1003";
        PreparedStatement pst2 = con.prepareStatement(query2);
        int num2 = pst2.executeUpdate();
        System.out.println("Succesfully executed");
 
    }
}