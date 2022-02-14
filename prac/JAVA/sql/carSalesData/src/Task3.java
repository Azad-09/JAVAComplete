import java.util.*;
import java.sql.*;
public class Task3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, World!");
        
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cars sales data", "root", "Azad@2923");
       
        // Task 3 --
        String query = "insert into orderTab values(3012, 3000, '15-05-2021', 1010)";
        PreparedStatement ps = con.prepareStatement(query);
        int num = ps.executeUpdate();
        System.out.println("Succesfully Executed");
    }
}