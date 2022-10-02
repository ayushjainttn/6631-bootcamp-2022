sealed class Parent permits Child1, Child2{
    void display(){
        System.out.println("I am Parent");
    }
}
non-sealed class Child1 extends Parent{
    void display(){
        System.out.println("I am Child 1");
    }
}
non-sealed class Child2 extends Parent{
    void display(){
        System.out.println("I am Child 2");
    }
}
public class Question12 {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.display();
        Parent c1 = new Child1();
        c1.display();
        Parent c2 = new Child2();
        c2.display();
    }
}
