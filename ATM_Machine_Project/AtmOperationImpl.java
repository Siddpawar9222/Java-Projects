
public class AtmOperationImpl implements AtmOperationInterface {

    ATM atm = new ATM();

    @Override
    public void viewBalance() {
        System.out.println("Available balance is : " + atm.getBalance());
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        if (withdrawAmount % 500 == 0) {

            if (atm.getBalance() - withdrawAmount > 0) {
                String moneyWithdrawn = withdrawAmount + " Withdrawn";
                atm.setMiniStatement(moneyWithdrawn);
                atm.setBalance(atm.getBalance() - withdrawAmount);
                System.out.println("Collect Your Cash " + withdrawAmount);
                viewBalance();
            } else {
                System.out.println("Insufficient Balance !!");
            }
        } else {
            System.out.println("Please Enter Amount Multiple of 500 !!");
        }
    }

    @Override
    public void depositAmount(double depositAmount) {
        String moneydeposited = depositAmount + " Deposited";
        atm.setMiniStatement(moneydeposited);
        atm.setBalance(atm.getBalance() + depositAmount);
        System.out.println(depositAmount + " Deposited Successfully !!");
        viewBalance();
    }

    @Override
    public void viewMiniStatement() {
    if(atm.getBalance() !=0) {

    
        for (String element : atm.getMiniStatement()) {
            System.out.println(element);
        }
    }else{
        System.out.println("Available balance is : " + atm.getBalance());
    }
    }

}