import java.util.Scanner;

public class MainClass {

    static void menu() {
        System.out.println();
        System.out.println(
                "======================= *** WELCOME TO SHOWROOM MANAGEMENT SYSTEM *** =======================");
        System.out.println();
        System.out.println("=============================== *** ENTER YOUR CHOICE *** ===============================");
        System.out.println();
        System.out.println("1].ADD SHOWROOMS \t\t\t 2].ADD EMPLOYEES \t\t\t 3].ADD CARS");
        System.out.println();
        System.out.println("4].GET SHOWROOMS \t\t\t 5].GET EMPLOYEES \t\t\t 6].GET CARS");
        System.out.println();
        System.out.println("=============================== *** ENTER 0 TO EXIT *** ===============================");

    }

    public static void main(String[] args) {
        ShowroomOpInterface sh = new ShowroomOpInterfaceImpl();
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                menu();
                System.out.println("Enter Your Choice");
              try{

              
                int choice = sc.nextInt();
                if (choice == 1) {
                    System.out.println("Enter Showroom Name : ");
                    sc.nextLine();
                    String showroomName = sc.nextLine();
                    System.out.println("Enter Showroom Address : ");
                    String showroomAddress = sc.nextLine();
                    System.out.println("Enter Manager Name : ");
                    String managerName = sc.nextLine();
                    System.out.println("Enter Total Employee to be work  : ");
                    int totalEmployees = sc.nextInt();
                    System.out.println("Enter Total Cars to be in Showroom  : ");
                    int totalCars = sc.nextInt();
                    sh.addShowroom(showroomName, showroomAddress, managerName, totalEmployees, totalCars);
                } else if (choice == 2) {
                    sh.getShowroomWithId();
                    System.out.println("Enter Showroom Id to Add Employees in for Corresponding Showroom");
                    int id = sc.nextInt();
                    sh.addEmployee(id);
                } else if (choice == 3) {
                    sh.getShowroomWithId();
                    System.out.println("Enter Showroom Id to Add Cars in for Corresponding Showroom");
                    int id = sc.nextInt();
                    sh.addCars(id);

                } else if (choice == 4) {
                    sh.getShowrrom();
                } else if (choice == 5) {
                    sh.getEmployee();
                } else if (choice == 6) {
                    sh.getCars();
                } else if (choice == 0) {
                    System.out.println("Bye !! Have a Nice Day");
                    System.exit(0);
                } else {
                    System.out.println("Please Enter Valid Choice");
                }

               }catch(Exception e){
                   System.out.println("**Please Enter valid Input**");
                   sc.nextLine();
               }
            }
        }
    }
}