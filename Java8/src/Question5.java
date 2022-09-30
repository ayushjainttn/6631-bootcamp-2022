/*
Q5)Implement multiple inheritance with default method inside interface.
 */

interface MyInterface1{
    default void display(){
        System.out.println("Hello from Interface1");
    }
}

interface MyInterface2{
    default void display(){
        System.out.println("Hello from Interface2");
    }
}

interface MyInterface3 extends MyInterface1, MyInterface2{
    default void display(){
        MyInterface1.super.display();
        MyInterface2.super.display();
        System.out.println("Hello from Interface3");
    }
}

public class Question5 implements MyInterface3{
    @Override
    public void display() {
        MyInterface3.super.display();
        System.out.println("Hello from Question5");
    }

    public static void main(String[] args) {
        new Question5().display();
    }
}
