
public class Cars {
    private int id ;
    private String carName;
    private String carColor;
    private String carType;
    private double carPrice;
    private double carMileage;

   

    public Cars(int id ,String carName, String carColor, String carType, double carPrice, double carMileage) {
        this.id=id ;
        this.carName = carName;
        this.carColor = carColor;
        this.carType = carType;
        this.carPrice = carPrice;
        this.carMileage = carMileage;
    }
    
    

    public String getCarName() {
        return carName;
    }
    public void setCarName(String carName) {
        this.carName = carName;
    }
    public String getCarColor() {
        return carColor;
    }
    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }
    public String getCarType() {
        return carType;
    }
    public void setCarType(String carType) {
        this.carType = carType;
    }
    public double getCarPrice() {
        return carPrice;
    }
    public void setCarPrice(double carPrice) {
        this.carPrice = carPrice;
    }
    public double getCarMileage() {
        return carMileage;
    }
    public void setCarMileage(double carMileage) {
        this.carMileage = carMileage;
    }



    public int getId() {
        return id;
    }



    public void setId(int id) {
        this.id = id;
    }
    

    
}