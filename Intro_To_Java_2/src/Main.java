enum AccType{
    SAVINGS,
    CURRENT
}

class InsufficientAmountException extends Exception{
    InsufficientAmountException(String message){
        super(message);
    }
}

abstract class Bank {
    private int accountNumber;
    private String ifscCode;
    private String accountHolderName;
    private AccType accountType;
    private double rateOfInterest;
    private double totalBalance;

    Bank(int accountNumber, String ifscCode, String accountHolderName, AccType accountType, double rateOfInterest, double totalBalance){
        this.accountNumber = accountNumber;
        this.ifscCode = ifscCode;
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
        this.rateOfInterest = rateOfInterest;
        this.totalBalance = totalBalance;
    }

    public void printDetails(){
        System.out.println("----------Account Details----------\nAccount Number - "+accountNumber+"\nAccount Holder - "+accountHolderName+"\nIFSC Code - "+ifscCode+"\nAccount Type - "+accountType+"\nRate of Interest - "+rateOfInterest+"\nTotal Balance - "+totalBalance+"\n");
    }

    public void getDetails(){

    }

    public void debitAmount(double amount) throws InsufficientAmountException{
        System.out.println("-------------Transaction--------------");
        if(amount>totalBalance){
            throw new InsufficientAmountException("Not enough balance. Transaction Failed!\n");
        }else{
            totalBalance = totalBalance - amount;
            System.out.println("Amount debited successfully.\n");
        }
    }

    public void creditAmount(double amount){
        System.out.println("-------------Transaction--------------");
        totalBalance = totalBalance+amount;
        System.out.println("Amount credited successfully\n");
    }

}

class SBI extends Bank{

    static int accountNumber = 1000;
    static final String IFSC = "SBIN0001";
    static final double INTEREST_RATE = 3.75;

    public SBI(String accountHolderName, AccType accountType, double totalBalance) {
        super(accountNumber, IFSC, accountHolderName, accountType, INTEREST_RATE, totalBalance);
        accountNumber += 1;
    }

    public void getDetails(){
        System.out.println("--------SBI Bank Details--------- \nIFSC - "+IFSC+"\nInterest Rate - "+INTEREST_RATE+"\n");
    }
}

class BOI extends Bank{
    static int accountNumber = 2000;
    static final String IFSC = "BOI0003";
    static final double INTEREST_RATE = 4.00;

    public BOI(String accountHolderName, AccType accountType, double totalBalance) {
        super(accountNumber, IFSC, accountHolderName, accountType, INTEREST_RATE, totalBalance);
        accountNumber += 1;
    }

    public void getDetails(){
        System.out.println("--------BOI Bank Details--------- \nIFSC - "+IFSC+"\nInterest Rate - "+INTEREST_RATE+"\n");
    }

}

class ICICI extends Bank{
    static int accountNumber = 3000;
    static final String IFSC = "ICICI0004";
    static final double INTEREST_RATE = 3.50;

    public ICICI(String accountHolderName, AccType accountType, double totalBalance) {
        super(accountNumber, IFSC, accountHolderName, accountType, INTEREST_RATE, totalBalance);
        accountNumber += 1;
    }

    public void getDetails(){
        System.out.println("--------ICICI Bank Details--------- \nIFSC - "+IFSC+"\nInterest Rate - "+INTEREST_RATE+"\n");
    }
}

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