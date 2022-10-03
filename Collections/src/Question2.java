import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Employees implements Comparable<Employees>{
    private String empFirstName;
    private String empLastName;
    private double empSalary;
    private int empAge;

    Employees(String empFirstName, String empLastName, double empSalary, int empAge){
        this.empFirstName = empFirstName;
        this.empLastName = empLastName;
        this.empSalary = empSalary;
        this.empAge =empAge;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "empFirstName='" + empFirstName + '\'' +
                ", empLastName='" + empLastName + '\'' +
                ", empSalary=" + empSalary +
                ", empAge=" + empAge +
                '}';
    }

    @Override
    public int compareTo(Employees employees) {
        int valueObtainedAfterComparing = this.empFirstName.compareTo(employees.empFirstName);
        if(valueObtainedAfterComparing==0){
            return this.empLastName.compareTo(employees.empLastName);
        }
        return valueObtainedAfterComparing;
    }
}
public class Question2 {
    public static void main(String[] args) {
        Employees e1 = new Employees("Ayush", "Jain", 23434.44, 22);
        Employees e2 = new Employees("Raj","Bhuva", 31241.24, 23);
        Employees e3 = new Employees("Utkarsh","Singh", 32739.34, 24);
        Employees e4 = new Employees("Priyansh","Gupta", 28308,22);
        Employees e5 = new Employees("Aniket","Agarwal", 77445.78, 21);

        List<Employees> empList  = new ArrayList<>();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        empList.add(e5);
        Collections.sort(empList);

        for(Employees e : empList){
            System.out.println(e);
        }
    }


}
