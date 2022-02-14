
import java.util.*;
import java.sql.*;
public class Task4 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, World!");
        
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cars sales data", "root", "Azad@2923");
       
        // Task 4 --
       String query = "update orderTab set amount = 3500 where amount = 3000";
       PreparedStatement pst = con.prepareStatement(query);
       int count = pst.executeUpdate();
       System.out.println("Successfully Executed");
    }
}