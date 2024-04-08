public class Test{
    public static void main(String[] args) {
        bankAccount account = new bankAccount("JuanDe Hattatime", 1000,3.0);
        System.out.println("Your new balance is "+ account.applyInterest());

        account.setInterestRate(2.0);
        System.out.println("The amount of money after new interest" +account.applyInterest());
    }
}
