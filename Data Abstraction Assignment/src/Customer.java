import java.util.ArrayList;
import java.util.Date;

public class Customer {
    private int accountNumber;
    private ArrayList<Deposit> deposits;
    private ArrayList<Withdraw> withdraws;
    private double checkBalance;
    private double savingBalance;
    private double savingRate;
    private String name;
    public static final String CHECKING = "Checking";
    public static final String SAVING = "Saving";
    private final int OVERDRAFT = -100;
    private static final int accountCount = 0;

    public Customer() {
        //create default constructor
        //customer default constructor
        this.name = "";
        this.checkBalance = 0;
        this.savingBalance = 0;
        this.accountNumber = -1;
        deposits = new ArrayList<Deposit>();
        withdraws = new ArrayList<Withdraw>();

    }

    /*
    Requires: String, int, double
    Modifies: this
    Effects: constructs a customer
     */
    public Customer(String name, int accountNumber, double checkDeposit, double savingDeposit) {
        //constructor code here
        //customer constructor
        this.name = name;
        this.accountNumber = accountNumber;
        this.checkBalance = checkDeposit;
        this.savingBalance = savingDeposit;
        deposits = new ArrayList<Deposit>();
        withdraws = new ArrayList<Withdraw>();

    }

    /*
    Requires: double, Date, checking String, saving String
    Modifies: deposits
    Effects: adds amount to checking balance or saving balance
     */
    public double deposit(double amt, Date date, String account) {
        //your code here
        //record deposit in checking account and adds it to an array list
        if (account == CHECKING) {
            deposits.add(new Deposit(amt, date, account));
            checkBalance += amt;
            return checkBalance;
        }

        //record deposit in saving account and adds it to an array list
        if (account == SAVING) {
            deposits.add(new Deposit(amt, date, account));
            savingBalance += amt;
            return savingBalance;
        //if the saving account or checking account is not chosen, a invalid message will print
        } else {
            System.out.println("Please Try Again, Invalid Account Chosen For Deposit");
        }
        return 0;
    }

    /*
    Requires: double, date, checking String and saving String
    Modifies: withdraws
    Effects: removes amount from checking balance or saving balance
     */
    public double withdraw(double amt, Date date, String account) {
        //your code here
        //overdraft check for savings account
        if (account == CHECKING) {
            if (checkOverdraft(amt, account)) {
                System.out.println("OVERDRAFT: accountNumber:" + accountNumber + "account: " + account);
                return checkBalance;

            }

            //withdraws from checking
            withdraws.add(new Withdraw(amt, date, account));
            checkBalance -= amt;
            return checkBalance;
        }

        //overdraft check for savings account
        if (account == SAVING) {
            if (checkOverdraft(amt, account)) {
                System.out.println("OVERDRAFT: accountNumber:" + accountNumber + " account: " + account);
                return checkBalance;
            }

            //withdraws from saving
            withdraws.add(new Withdraw(amt, date, account));
            savingBalance -= amt;
            return savingBalance;

        //if the saving account or checking account is not chosen, a invalid message will print
        } else {
            System.out.println("Please Try Again, Invalid Account Chosen For Withdraw");
            return -1;
        }
    }

        /*
        Requires: double, checking String, saving String
        Modifies: none
        Effects: returns true if withdrawn amount from checking account or saving account is greater than the overdraft limit
         */
        private boolean checkOverdraft(double amt, String account){
            //your code here
            //returns true if the withdrawn amount from checking account is greater than the overdraft limit
            if (account == CHECKING) {
                return (-amt + checkBalance) < OVERDRAFT;
            }

            //returns true if the withdrawn amount from saving account is greater than the overdraft limit
            if (account == SAVING) {
                return (-amt + savingBalance) < OVERDRAFT;
            }

            //if the saving account or checking account is not chosen, a invalid message will print
            else {
                System.out.println("Please Try Again, Invalid Account Chosen For Overdraft Check");
                return true;
            }

        }
            /*
            Requires: nothing
            Modifies: nothing
            Effects: prints all deposits
             */
            //do not modify
            public void displayDeposits () {
                for (Deposit d : deposits) {
                    System.out.println(d);
                }
            }
            /*
            Requires: nothing
            Modifies: nothing
            Effects: prints all deposits
             */
            //do not modify
            public void displayWithdraws () {
                for (Withdraw w : withdraws) {
                    System.out.println(w);
                }
            }

    }


