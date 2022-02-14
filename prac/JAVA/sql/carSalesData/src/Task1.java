import java.util.*;
import java.sql.*;
public class Task1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, World!");
        
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cars sales data", "root", "Azad@2923");
        
        // Task 1 -- Adding Jhon Kenov
        System.out.println("Enter the Sales ID:");
        int saId = sc.nextInt();
        System.out.println("Enter the Name:");
        String name = sc.nextLine();
        System.out.println("Enter the City:");
        String city = sc.nextLine();
        System.out.println("Enter the Commission Rate:");
        int comRate = sc.nextInt();

        String query = "insert into salesPerson values(?,?,?,?)";
        PreparedStatement pst = con.prepareStatement(query);
        pst.setInt(1, saId);
        pst.setString(2, name);
        pst.setString(3, city);
        pst.setInt(4, comRate);
        int num = pst.executeUpdate();
        System.out.println("Succesfully executed");
        
    }
}