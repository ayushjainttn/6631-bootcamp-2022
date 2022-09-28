public class Main {
    public static void main(String[] args) {
        Bank b1 = new SBI("Ayush Jain", AccType.SAVINGS, 3000);
        b1.printDetails();
        b1.getDetails();
        b1.creditAmount(2000);
        b1.printDetails();
        try{
            b1.debitAmount(7000);
        }catch(InsufficientAmountException e){
            System.out.println(e.getMessage());
        }
        b1.printDetails();
        try{
            b1.debitAmount(3000);
        }catch(InsufficientAmountException e){
            System.out.println(e.getMessage());
        }
        b1.printDetails();
    }
}