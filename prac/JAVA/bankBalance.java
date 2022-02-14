// BankAccount
// 3 ppl who has account inthe bank
// accountId, balance, cust_name, bank_name

public class BankAccount{
        int accId;
        int balance;
        String custName;
        String bankName;


        class MainProgramme{
    public static void main (String [] args){


        BankAccount radhe = new BankAccount();
        radhe.custName = "Radhe Bhai";
        radhe.bankName = "Axis Bank";
        radhe.accId = 1011;
        radhe.balance = 10000;
        System.out.println("Customer name is: " + radhe.custName + "\n" + "Balance is: " + radhe.balance);

        BankAccount pinky = new BankAccount();
        pinky.custName = "Pinky Tripathy";
        pinky.bankName = "State Bank Of India";
        pinky.accId = 1040;
        pinky.balance = 15000;
        System.out.println("Customer name is: " + pinky.custName + "\n" + "Balance is: " + pinky.balance);

        BankAccount happu = new BankAccount();
        happu.custName = "Happu Singh";
        happu.bankName = "Nichawar Bank";
        happu.accId = 1099;
        happu.balance = 5000000;
        System.out.println("Customer name is: " + happu.custName + "\n" + "Balance is: " + happu.balance);


    }
}
}

