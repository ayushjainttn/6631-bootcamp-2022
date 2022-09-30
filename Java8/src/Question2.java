/*
Q2) Using (instance) Method reference create and apply add and subtract method and using (Static) Method reference create and apply multiplication method for the functional interface created
 */


class MethodReferenceExample{
    void addNumbersNonStatic(int a, int b){
        System.out.println("Add result :" + (a+b));
    }

    void subtractNumbersNonStatic(int a, int b){
        System.out.println("Subtract result :" + (a-b));
    }

    static void multiplyNumbersStatic(int a, int b){
        System.out.println("Multiply result :" + (a*b));
    }
}

interface MyInterface{
    void performOperation(int a, int b);
}


public class Question2 {
    public static void main(String[] args){
        MyInterface addNums = new MethodReferenceExample()::addNumbersNonStatic;
        addNums.performOperation(3, 4);

        MyInterface subNums = new MethodReferenceExample()::subtractNumbersNonStatic;
        subNums.performOperation(5,2);

        MyInterface mulNums = MethodReferenceExample::multiplyNumbersStatic;
        mulNums.performOperation(6, 3);

    }
}
