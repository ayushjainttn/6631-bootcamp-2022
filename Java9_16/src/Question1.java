interface PrivateMethodsInInterface{

    private static void doIncrement(int num){
        num+=1;
        System.out.println(num);
    }
    static void getIncrementedValue(int num){
        doIncrement(num);
    }
}

public class Question1{
    public static void main(String[] args) {
        PrivateMethodsInInterface.getIncrementedValue(5);
    }
}
