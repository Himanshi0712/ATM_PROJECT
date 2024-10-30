package java_project;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.io.IOException;
import java.util.Scanner;

public class OptionMenu extends Acoount{
    Scanner sc=new Scanner(System.in);
    DecimalFormat moneyFormat=new DecimalFormat("'$'###,##0.00");

    HashMap<Integer,Integer> data=new HashMap<>();
    
    public void getLogin() throws IOException{
        int x=1;
        do{
            try{
                data.put(123,8930);
                data.put(231,7406);

                System.out.println("Welcome to the Atm");
                System.out.println("Enter Your customer Id");
                setCustomerNumber(sc.nextInt());
                System.out.println("Enter Your customer Pin");
                setCustomerPin(sc.nextInt());


            }
            catch( Exception e){
                System.out.println("\n" + "Invalid characters.only numbers");
                x=2;
            }
            int c=getCustomer_Id();
            int pn=getCustomer_pin();

            if(data.containsKey(c) && data.get(c)==pn){
                getAccountType();
        
            }
            else {
                System.out.println("Invalid pin or customer Id");

            }   

        }while(x==1);
    }


        public void getAccountType() {
            System.out.println("Select the Account You want");
            System.out.println("Type-1 Checking Account");
            System.out.println("Type-2 Saving Account");
            System.out.println("Type-3 Exit");

            int selection=sc.nextInt();

            switch(selection){
                case 1:
                   getChecking();
                   break;
                case 2:
                   getSaving();
                   break;
                case 3:
                   System.out.println("thank u for using atm");
                   break;

                default:
                    System.out.println("Invalid choice");
                    getAccountType();
                

            }
        }

        public void getChecking(){
            System.out.println("Checking Account");
            System.out.println("Type-1 View Balance");
            System.out.println("Type-2 Withdraw funds");
            System.out.println("Type-3 Deposit funds");
            System.out.println("Type-4 Exit");

            int selection=sc.nextInt();
            switch(selection){
                case 1:
                System.out.println("Checking Account Balance " + moneyFormat.format(getchecking_balance()));
                getAccountType();
                   break;
                case 2:
    
                   getChecking_Withdraw();
                   System.out.println("New checking Account Balance left " + moneyFormat.format(getchecking_balance()));
                   getAccountType();
                   break;
                case 3:
                   get_checking_deposit();
                   System.out.println("New checking Account Balance left " + moneyFormat.format(getchecking_balance()));
                   getAccountType();
                   break;

                case 4:
                   System.out.println("thank u for using atm");
                   break;

                default:
                    System.out.println("Invalid choice");
                    getChecking();
                

            }
        }
            public void getSaving(){
                System.out.println("Sving Account");
                System.out.println("Type-1 View Balance");
                System.out.println("Type-2 Withdraw funds");
                System.out.println("Type-3 Deposit funds");
                System.out.println("Type-4 Exit");
    
                int selection=sc.nextInt();
                switch(selection){
                    case 1:
                    System.out.println("Checking Account Balance " + moneyFormat.format(getSavingBalance()));
                    getAccountType();
                       break;
                    case 2:
                       getSaving_withdraw();
                       System.out.println("New saving Account Balance left " + moneyFormat.format(getSavingBalance()));
                       getAccountType();
                       break;
                    case 3:
                       get_saving_deposit();
                       System.out.println("New saving Account Balance left " + moneyFormat.format(getSavingBalance()));
                       getAccountType();
                       break;
    
                    case 4:
                       System.out.println("thank u for using atm");
                       break;
    
                    default:
                        System.out.println("Invalid choice");
                        getSaving();
                    
    
                }




        }


    }



    

