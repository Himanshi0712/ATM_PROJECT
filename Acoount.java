package java_project;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Acoount {
    private int Customer_id;
    private int customer_pin;
    private double checking_balance=0;
    private double saving_balance=0;

    Scanner sc=new Scanner(System.in);
    DecimalFormat moneyFormat=new DecimalFormat("'$'###,##0.00");

    public int setCustomerNumber(int Customer_id){
        this.Customer_id=Customer_id;
        return Customer_id;

    }
    public int setCustomerPin(int customer_pin){
        this.customer_pin=customer_pin;
        return customer_pin;
    }
    public int getCustomer_Id(){
        return Customer_id;
    }
    public int getCustomer_pin(){
        return customer_pin;
    }
    public double getSavingBalance(){
        return saving_balance;
    }
    public double getchecking_balance(){
        return checking_balance;
    }
    public double new_checking_balance(double amount){
        checking_balance-=amount;
        return checking_balance;
    }
    public double new_saving_balance(double amount){
        saving_balance-=amount;
        return saving_balance;
    }
    public double new_checking_deposit(double amount){
        checking_balance+=amount;
        return checking_balance;
    }
    public double new_saving_deposit(double amount){
        saving_balance+=amount;
        return saving_balance;
    }

    public void getChecking_Withdraw(){
        System.out.println(moneyFormat.format(checking_balance));
        System.out.println("enter the amount u want to withdraw");
        double amount=sc.nextDouble();

        if(checking_balance- amount>0){
            new_checking_balance(amount);
            System.out.println("NEW checking balance"+ moneyFormat.format(checking_balance));
        }
        else {
            System.out.println("insufficient balance");
        }
    }


    public void getSaving_withdraw(){
        System.out.println(moneyFormat.format(checking_balance));
        System.out.println("enter the amount u want to withdraw");
        double amount=sc.nextDouble();

        if(checking_balance- amount>0){
            new_saving_balance(amount);
            System.out.println("NEW checking balance"+ moneyFormat.format(checking_balance));
        }
        else {
            System.out.println("insufficicebt balance");
        }

    }

    public void  get_checking_deposit(){
        System.out.println("the amount you have "+ moneyFormat.format(checking_balance));
        System.out.println("the amount u want to deposit ");

        double amount=sc.nextDouble();

        if(checking_balance+amount>0){
            new_checking_deposit(amount);
            System.out.println("the amount you have "+ moneyFormat.format(checking_balance));
        }
    }

    public void  get_saving_deposit(){
        System.out.println("the amount you have "+ moneyFormat.format(saving_balance));
        System.out.println("the amount u want to deposit ");

        double amount=sc.nextDouble();

        if(checking_balance+amount>0){
            new_saving_deposit(amount);
            System.out.println("the amount you have "+ moneyFormat.format(saving_balance));
        }
    }



    
}
