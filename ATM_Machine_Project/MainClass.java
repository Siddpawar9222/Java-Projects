import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        AtmOperationInterface op = new AtmOperationImpl();

        int atmNumber = 12345;
        int atmPin = 123;
        int atmNumberUser=0 ;
        int atmPinUser=0 ;
        System.out.println("Welcome to ATM Machine !!!");
        Scanner sc = new Scanner(System.in);
        try{

       
        System.out.println("Enter ATM number : ");
         atmNumberUser = sc.nextInt();

        System.out.println("Enter Pin : ");
         atmPinUser = sc.nextInt();
    }catch(Exception e){
        System.out.println("Please Enter Valid Input");
        System.exit(0);
    }
        if (atmNumber == atmNumberUser && atmPin == atmPinUser) {
            System.out.println("Validation Done");

            while (true) {

                try {

                    System.out.println("||=================================||");
                    System.out.println(
                            "1.View Available Balance\n2.Withdraw Amount\n3.Deposit Money\n4.View Ministatement\n5.Exit");
                    System.out.println("Enter Your Choice : ");
                    int choice = sc.nextInt();
                    if (choice == 1) {
                        op.viewBalance();
                    } else if (choice == 2) {
                        System.out.println("Enter Amount To Withdraw : ");
                        double withdrawAmount = sc.nextDouble();
                        op.withdrawAmount(withdrawAmount);

                    } else if (choice == 3) {
                        System.out.println("Enter Amount To Deposit : ");
                        double depositAmount = sc.nextDouble();
                        op.depositAmount(depositAmount);
                    } else if (choice == 4) {
                        op.viewMiniStatement();
                    } else if (choice == 5) {
                        System.out.println("Collect Your ATM Card\nThank You For Using ATM Machine");
                        System.exit(0);
                    } else {
                        System.out.println("Please Enter Correct Choice");
                    }

                } catch (Exception e) {
                    System.out.println("please Enter Valid Input ");
                    sc.nextLine();
                }
            }
        } else {
            System.out.println("Incorrect ATM number or Pin. Please Try Again");
            System.exit(0);
        }

        sc.close();

    }
}
