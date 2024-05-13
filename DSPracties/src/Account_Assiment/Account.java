package Account_Assiment;
import java.util.Date;

public class Account {
    private String accountNumber;
    private  double balance;
    private Date dateCreated;
    private  String fullName;
    public  Account(String accountNumber,double balance,String fullName){
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.dateCreated=new Date();
        this.fullName=fullName;
    }
    public  void deposit(double amount){
        balance+=amount;
    }
    public  void withdraw(double amount){
        if(amount<=balance){
            balance-=amount;
        }else
            System.out.println("insufficient ");
    }
    public double checkBalance(){
        return balance;
  }
}
