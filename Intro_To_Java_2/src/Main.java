public class Main {
    public static void main(String[] args) {
        Bank b1 = new SBI("Ayush Jain", AccType.SAVINGS, 3000);
        Bank b2 = new ICICI("Jatin Arora", AccType.CURRENT, 7650);
        Bank b3 = new BOI("Raj Sharma", AccType.SAVINGS, 3870);

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

        b2.creditAmount(4512);
        try{
            b2.debitAmount(3000);
        }catch (InsufficientAmountException e){
            System.out.println(e.getMessage());
        }

        b3.creditAmount(7000);
        b3.creditAmount(2500);

        b1.creditAmount(6400);
    }
}