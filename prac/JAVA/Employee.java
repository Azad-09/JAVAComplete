class Employee{
    int empID 
    String empName, address;

    public void displayDetails(){
        System.out.println("Name of Employee: " + empName + "with ID: " + empID + " and with address " + address);
    }
}

class ParmanentEmp{
    int basicPay, pf, gross;
     
    public void calcGross(){
        System.out.println()
    } 

}

class Main{
    public static void main (String [] args){
        ParmanentEmp pe1 = new ParmanentEmp(091827, "Azad", "Chandni Chowk", 37000, 7000, 0);
        ParmanentEmp pe1 = new ParmanentEmp(081726, "Dawood", "Dubai", 50000, 9000, 0);
        TemporaryEmp te1 = new TemporaryEmp(071625, "Osama", "Pakistan", 10, 100, 0);
        TemporaryEmp te1 = new TemporaryEmp(061524, "Kasab", "Mumbai", 18, 220, 0);

        pe1.calcGross();
        pe2.calcGross();
        te1.calcTotal();
        te2.calcTotal();
    }
}

 Diesel di1 = new Diesel("D1300", 67, 6000, 200, 111, 1248, 4, "17.6:1");
 Diesel di1 = new Diesel("D1300", 67, 6000, 200, 111, 1248, 4, "17.6:1");
 Diesel di1 = new Diesel("D1300", 67, 6000, 200, 111, 1248, 4, "17.6:1");