import java.util.ArrayList;
import java.util.List;

public class Showroom {
    private String showroomName;
    private String showroomaddress;
    private String managerName;
    private List<Employees> totalEmployees;
    private List<Cars> totalCarsInStocks;

    public Showroom() {

    }

    public Showroom(String showroomName, String showroomaddress, String managerName, int totalEmployees,
            int totalCars) {
        this.showroomName = showroomName;
        this.showroomaddress = showroomaddress;
        this.managerName = managerName;
        this.totalEmployees = new ArrayList<>();
        this.totalCarsInStocks = new ArrayList<>();

        for (int i = 0; i < totalEmployees; i++) {
            this.totalEmployees.add(i, null);
        }

        for (int i = 0; i < totalCars; i++) {
            this.totalCarsInStocks.add(i, null);
        }
    }

    public String getShowroomName() {
        return showroomName;
    }

    public void setShowroomName(String showroomName) {
        this.showroomName = showroomName;
    }

    public String getShowroomaddress() {
        return showroomaddress;
    }

    public void setShowroomaddress(String showroomaddress) {
        this.showroomaddress = showroomaddress;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public List<Employees> getTotalEmployees() {
        return totalEmployees;
    }

    public void setTotalEmployees(int idx ,Employees em) {
        this.totalEmployees.set(idx,em);
        System.out.println(this.totalEmployees);
    }

    public List<Cars> getTotalCarsInStocks() {
        return totalCarsInStocks;
    }

    public void setTotalCarsInStocks(int idx ,Cars c) {
        this.totalCarsInStocks.set(idx, c) ;
    }

}
