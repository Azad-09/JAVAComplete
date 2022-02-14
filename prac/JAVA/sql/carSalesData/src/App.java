import java.util.*;
import java.sql.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, World!");
        
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cars sales data", "root", "Azad@2923");
        
        //Task 1
        System.out.println("Enter the Customer ID");
        int id = sc.nextInt();
        String myQue1 = "select * from customer where customerId = "+id+" ";
        Statement st = con.createStatement();
        ResultSet rs1 = st.executeQuery(myQue1);
        System.out.println("++==++==++==++==++==++==++==++== Task 1 ==++==++==++==++==++==++==++");
        System.out.println("\t    ID\t\t FName\t\t LName\t\t City\t\t Rating\t\t SalesID ");
        while(rs1.next())
        {
         System.out.format("%15s\t%15s\t%15s\t%15s\t%15s\t%15s\n",rs1.getString("customerId") ,rs1.getString("firstName") , rs1.getString("lastName")  , rs1.getString("city") , rs1.getString("rating"), rs1.getString("salesID"));
        }

        //Task 2
        System.out.println("Enter The City Name");
        String cityName = sc.next();

        String myQue2 = " select * from salesPerson where city = ? ";
        PreparedStatement pst = con.prepareStatement(myQue2);
        pst.setString(1, cityName);
        ResultSet rs2 = pst.executeQuery();
        System.out.println("++==++==++==++==++==++==++==++== Task 2 ==++==++==++==++==++==++==++");
        System.out.println("\tSales ID\t Name\t\t  City\t     Commission Rate");
        while (rs2.next()) {
            System.out.format("%15s\t%15s\t%15s\t%15s\n", rs2.getString("salesId"), rs2.getString("firstName"), rs2.getString("city"), rs2.getString("commisionRate"));
        }

        //Task 3
        System.out.println("Enter The Date In Format:");
        String dateForm = sc.next();
        String myQue3 = "select * from orderTab where orderDate < ? ";
        PreparedStatement pst2 = con.prepareStatement(myQue3);
        pst2.setString(1, dateForm);
        ResultSet rs3 = pst2.executeQuery();
        System.out.println("++==++==++==++==++==++==++==++== Task 3 ==++==++==++==++==++==++==++");
        System.out.println("\tOrder ID\t Amount\t   Order Date\t   Customer ID");
        while (rs3.next()) {
            System.out.format("%15s\t%15s\t%15s\t%15s\n", rs3.getString("orderId"), rs3.getString("amount"), rs3.getString("orderDate"), rs3.getString("customerId"));
        }

        // Task 4
        System.out.println("Enter The Rating:");
        int rating = sc.nextInt();
        String myQue4 = "select * from customer where rating = ?";
        PreparedStatement pst3 = con.prepareStatement(myQue4);
        pst3.setInt(1, rating);
        ResultSet rs4 = pst3.executeQuery();
        System.out.println("++==++==++==++==++==++==++==++== Task 3 ==++==++==++==++==++==++==++");
        System.out.println("\t    ID\t\t FName\t\t LName\t\t City\t\t Rating\t\t SalesID ");
        while(rs4.next()){
            System.out.format("%15s\t%15s\t%15s\t%15s\t%15s\t%15s\n",rs4.getString("customerId") ,rs4.getString("firstName") , rs4.getString("lastName"), rs4.getString("city") , rs4.getString("rating"), rs4.getString("salesID"));
        }

        
    }
}