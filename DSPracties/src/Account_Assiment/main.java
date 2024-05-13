package Account_Assiment;

public class main {
    public static void main(String[] args) {
        Account myacc = new Account("232", 1000.0, "Ali");
        System.out.println(myacc.checkBalance());
        myacc.deposit(500);
        myacc.withdraw(200);
        System.out.println("the account balance: " + myacc.checkBalance());

        SavingAccount sv = new SavingAccount("4444", 2000, "Ali Abdi");
        sv.deposit(2000);
        sv.withdraw(1000);
        System.out.println("Saving Account balace: " + sv.checkBalance());
    }
}
