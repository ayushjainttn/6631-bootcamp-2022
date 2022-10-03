import java.util.*;

class Employee{
    String empName;
    String empDesignation;
    int empAge;

    int empSalary;

    Employee(String empName, String empDesignation,  int empAge, int empSalary){
        this.empName = empName;
        this.empDesignation = empDesignation;
        this.empAge = empAge;
        this.empSalary = empSalary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empAge == employee.empAge && empSalary == employee.empSalary && Objects.equals(empName, employee.empName) && Objects.equals(empDesignation, employee.empDesignation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empName, empDesignation, empAge, empSalary);
    }
}
public class Question4 {

    public static void main(String[] args) {
        Employee e1 = new Employee("Ayush", "Software Engineer", 22, 15000);
        Employee e2 = new Employee("Raj", "Software Engineer", 22, 15000);
        Employee e3 = new Employee("Ujjwal", "Devops Engineer", 23, 20000);
        Employee e4 = new Employee("Ujjwal", "Devops Engineer", 23, 20000);

        Map<Employee, Integer> empMap = new HashMap<>();
        empMap.put(e1, e1.empSalary);
        empMap.put(e2, e2.empSalary);
        empMap.put(e3, e3.empSalary);
        empMap.put(e4, e4.empSalary);

        for(Employee e : empMap.keySet()){
            System.out.println(e+": "+empMap.get(e));
        }

    }
}
