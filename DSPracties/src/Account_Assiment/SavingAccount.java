package Account_Assiment;


public class SavingAccount  extends Account{

    public SavingAccount(String accountNumber, double balance, String fullName) {
        super(accountNumber, balance, fullName);
    }
    @Override
    public void withdraw(double amount){
        super.withdraw(amount);
   }
}
