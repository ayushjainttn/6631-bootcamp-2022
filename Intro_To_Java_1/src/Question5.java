/*
Q5) Create a class named Employee with fields firstname,lastname,age and designation.
        The class should:
        1. have all types of constructors to initialize the object
        2. class should also have setter methods to update a particular field
        3. Override its toString method to display a meaningful message using all these fields.
*/

class Employee{
    private String firstName;
    private String lastName;
    private String designation;
    private int age;

    public Employee() {
    }

    public Employee(String firstName, String lastName, String designation, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.designation = designation;
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee details : " +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", designation='" + designation + '\'' +
                ", age=" + age;
    }
}
public class Question5 {
    public static void main(String [] args){
        Employee e1 = new Employee("Ayush", "Jain", "Software Engineer", 22);
        Employee e2 = new Employee("Raj", "Bhuva", "DevOps Engineer", 22);

        System.out.println(e1.toString());
        System.out.println(e2.toString());

        e1.setAge(23);
        e1.setDesignation("Trainee");
        e2.setDesignation("Software Engineer");

        System.out.println(e1.toString());
        System.out.println(e2.toString());
    }
}
