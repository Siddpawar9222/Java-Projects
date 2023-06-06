import java.util.ArrayList;
import java.util.List;

public class ATM {
    private double balance;
    private double depositAmount;
    private double withdrawAmount;
    private List<String> ministatement ;

    // default constructor
    public ATM() {
        this.balance=0.0 ;
        this.ministatement=new ArrayList<>() ;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public double getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(double withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }

    public List<String> getMiniStatement(){
     return ministatement ;
    }

    public void setMiniStatement(String str){
        this.ministatement.add(str) ;
    }

}
