import java.util.Date;

public class Withdraw {
    private double amount;
    private Date date;
    private String account;

    Withdraw(double amount, Date date, String account){
        this.amount = amount;
        this.date = date;
        this.account = account;
    }

    public String toString(){
        //your code here
        //returns withdraw amount, date, and the account
        return ("Withdraw of: $" + amount + " Date: " + date + " into account: " + account);
    }
}

