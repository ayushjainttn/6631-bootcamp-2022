//Q1) Write a class with FirstName, LastName & age field. Print Firstname, LastName & age using static block, static method & static variable respectively.

public class Question1 {
    static String firstName;
    static String lastName;
    static int age;

    public static void displayName(){
        System.out.println("Inside static method");
        firstName = "Ravi";
        lastName = "Sharma";
        age = 20;
        System.out.println("My name is : "+firstName+" "+lastName+" and I am "+age+" years old.");
    }
    static {
        System.out.println("Inside static block");
        firstName = "Ayush";
        lastName = "Jain";
        age = 22;
        System.out.println("My name is : "+firstName+" "+lastName+" and I am "+age+" years old.");
    }
    public static void main(String[] args){
        Question1.displayName();

        System.out.println("Printing using static variables");
        System.out.println("My name is : "+firstName+" "+lastName+" and I am "+age+" years old.");
    }
}