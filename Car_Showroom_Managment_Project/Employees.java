

public class Employees {
    private int empId ;
    private String empName ;
    private int age ;
    private String department ;
   
    


    public Employees(int empId, String empName, int age, String department) {
        this.empId = empId;
        this.empName = empName;
        this.age = age;
        this.department = department;
    }
    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

 
    
}
