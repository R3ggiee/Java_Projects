////Write a class called BankAccount that has the following:
////(a) A private double field called amount that stores the amount of money in the account.
////(b) A private double field called interestRate that stores the account’s interest rate.
////(c) A private string field called name that stores the name of the account holder.
////(d) A constructor that just sets the values of the three fields above.
////(e) Getters and setters for each of the three fields.
////(f) A method called applyInterest that takes no arguments and applies the interest to the account.
////For instance, if the account has $1000 in it and the interest rate is 3%, then the amount variable
////should be changed to $1030 ($1000 + 3% interest)
public class bankAccount {
    private String accountName;
    private double amount;
    private double interestRate;
    public bankAccount(String accountName, double amount, double interestRate){
        this.accountName=accountName;
        this.amount=amount;
        this.interestRate=interestRate;
    }

    public String getAccount(){
        return accountName;
    }

    public void setAccount(String accountName){
        this.accountName=accountName;
    }

    public double getAmount(){
        return amount;
    }

    public void setAmount(double amount){
        this.amount=amount;
    }

    public double getInterestRate(){
        return interestRate;
    }

    public void setInterestRate(double interestRate){
        this.interestRate=interestRate;
    }

    public double applyInterest(){
         double newAmount = amount * (getInterestRate()/100.0);
         amount+=newAmount;
         return amount;
    }
}
