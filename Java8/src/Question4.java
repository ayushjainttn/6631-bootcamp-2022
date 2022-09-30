import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/*
Q4) WAP using java 8:

    Collect all  even numbers from a list using stream
    Given a list of objects of following class:

           class Employee{
           String fullName;
           Long salary;
           String city;
           }

          Get list of all unique firstNames of employees where their salary is less than 5000 and who live in delhi.
          Note: Full name is concatenation of first name, middle name and last name with single space in between.
 */

class Employee{
    String fullName;
    Long salary;
    String city;

    Employee(String fullName, Long salary, String city){
        this.fullName=fullName;
        this.salary=salary;
        this.city=city;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", salary=" + salary +
                ", city='" + city + '\'' +
                '}';
    }
}

public class Question4 {
    public static void main(String[] args) {
        System.out.println(
                Arrays.asList(1,2,3,4,5,6,7,8).stream().filter(e->e%2==0).collect(Collectors.toList())
        );

        Employee e1 = new Employee("Ayush Jain", 15000L, "Noida");
        Employee e2 = new Employee("Raj Bhuva", 35000L, "Surat");
        Employee e3 = new Employee("Ujjwal Bhatia", 3000L, "Delhi");
        Employee e4 = new Employee("Ayush Sharma", 2000L, "Delhi");
        Employee e5 = new Employee("Vikash", 10000L,"Banaras");

        System.out.println(
                Stream.of(e1,e2,e3,e4,e5).filter(employee -> employee.salary<5000 && employee.city.equals("Delhi")).collect(Collectors.toSet())
        );


    }
}
