import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShowroomOpInterfaceImpl implements ShowroomOpInterface {
    List<Showroom> s = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    @Override
    public void addShowroom(String showroomName, String showroomaddress, String managerName, int totalEmployees,
            int totalCars) {
        s.add(new Showroom(showroomName, showroomaddress, managerName, totalEmployees, totalCars));
        System.out.println("New Showroom has been Added");
        getShowrrom();
    }

    @Override
    public void addEmployee(int id) {
        int idx = 0;
        while (idx != s.get(id).getTotalEmployees().size()) {
            System.out.println("1].To Add Employee\n0].To Exit");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Enter Employee Name");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.println("Enter Employee Age : ");
                int age = sc.nextInt();
                System.out.println("Enter Employee Department :");
                sc.nextLine();
                String dept = sc.nextLine();
                Employees em = new Employees(idx, name, age, dept);
                s.get(id).setTotalEmployees(idx, em);
                idx++;
            } else if (choice == 0) {
                break;
            } else {
                System.out.println("Please Enter Valid Choice");
            }
        }

    }

    @Override
    public void addCars(int id) {
        int idx = 0;
        while (idx != s.get(id).getTotalCarsInStocks().size()) {
            System.out.println("1].To Add Cars\n0].To Exit");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Enter Car Name");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.println("Enter Car Color : ");
                String color = sc.nextLine();
                System.out.println("Enter Car Type :");
                String carType = sc.nextLine();
                System.out.println("Enter Car Price :");
                Double price = sc.nextDouble();
                System.out.println("Enter Car Mileage :");
                Double mileage = sc.nextDouble();
                Cars c = new Cars(idx,name, color, carType, price, mileage);
                s.get(id).setTotalCarsInStocks(idx, c);
                idx++;
            } else if (choice == 0) {
                break;
            } else {
                System.out.println("Please Enter Valid Choice");
            }
        }
    }

    @Override
    public void getShowrrom() {
        System.out.println("||=======================================||");
        for (Showroom e : s) {
            System.out.println("Showroom Id : " + s.indexOf(e));
            System.out.println("Showroom Name is : " + e.getShowroomName());
            System.out.println("Showroom Address is :" + e.getShowroomaddress());
            System.out.println("Showroom Manager name is : " + e.getManagerName());
            System.out.println("Number of Employees is : " + e.getTotalEmployees().size());
            System.out.println("Cars in showroom : " + e.getTotalCarsInStocks().size());
        }
        System.out.println("||=======================================||");
    }

    @Override
    public void getEmployee() {
        getShowroomWithId();
        System.out.println("Enter Id Of Showroom : ");
        int id = sc.nextInt();
        for (Employees element : s.get(id).getTotalEmployees()) {
            if (element != null) {
                System.out.println("||================||");
                System.out.println("Id of Employee :" + element.getEmpId());
                System.out.println("Name of Employee :" + element.getEmpName());
                System.out.println("Age of Employee :" + element.getAge());
                System.out.println("Department of Employee :" + element.getDepartment());
                System.out.println("||================||");

            }
        }
    }

    @Override
    public void getCars() {
        getShowroomWithId();
        System.out.println("Enter Id Of Showroom : ");
        int id = sc.nextInt();
        for (Cars element : s.get(id).getTotalCarsInStocks()) {
            if (element != null) {
                System.out.println("||================||");
                System.out.println("Id of Car :" + element.getId());
                System.out.println("Name of Car :" + element.getCarName());
                System.out.println("Color of Car :" + element.getCarColor());
                System.out.println("Mileage of Car :" + element.getCarMileage());
                System.out.println("Price of Car :" + element.getCarPrice());
                System.out.println("||================||");

            }
        }
    }

    @Override
    public void getShowroomWithId() {
        System.out.println("Available Showrooms are : ");
        for (Showroom sho : s) {
            System.out.println("Showroom \"" + sho.getShowroomName() + "\" with id " + s.indexOf(sho));
        }
    }

}
