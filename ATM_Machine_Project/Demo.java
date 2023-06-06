import java.util.HashMap;
import java.util.Map;

class Employee{
    private String name ;
    private double salary ;
    
    public Employee(String name , double salary){
        this.name =name;
        this.salary= salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
      
        return "Employee [name=" + name + ", salary=" + salary + "]\n";
    }

    
    
}

public class Demo {
     public static void main(String[] args) {
        Map<Integer ,Employee> emps = new HashMap<>();
        emps.put(101, new Employee("Mohan", 20000));
        emps.put(102, new Employee("Satish", 30000));
        emps.put(103, new Employee("Ketan", 1000));
        emps.put(104, new Employee("Manish", 15000));
        emps.put(105, new Employee("Kedar", 150000));

        // System.out.println(emps);

        // System.out.println(emps.get(107));
        // System.out.println(emps.containsKey(106));

        // System.out.println(emps.keySet());
        // System.out.println(emps.values());

        Map<Integer ,Employee> emps1 = new HashMap<>();
        emps1.put(106, new Employee("Saskhi", 20000));
        emps1.put(107, new Employee("Vidya", 30000));
        emps1.put(108, new Employee("sammi", 1000));

        emps.putAll(emps1);

        
        System.out.println(emps.size());


        // System.out.println("Removed value is " + emps.remove(104));
        // emps.clear();
        // System.out.println(emps.isEmpty());

        emps.putIfAbsent(101, new Employee("ketiki", 455122));
        emps.putIfAbsent(110, new Employee("ketiki", 455122));
        System.out.println(emps);
       
       
        System.out.println(emps.getOrDefault(115, new Employee("Elon", 4511)));
     
     }
}


