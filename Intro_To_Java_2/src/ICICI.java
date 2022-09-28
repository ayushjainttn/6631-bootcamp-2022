class ICICI extends Bank{
    private static int accountNumber = 3000;
    private static final String IFSC = "ICICI0004";
    private static final double INTEREST_RATE = 3.50;

    public ICICI(String accountHolderName, AccType accountType, double totalBalance) {
        super(accountNumber, IFSC, accountHolderName, accountType, INTEREST_RATE, totalBalance);
        accountNumber += 1;
    }

    public void getDetails(){
        System.out.println("--------ICICI Bank Details--------- \nIFSC - "+IFSC+"\nInterest Rate - "+INTEREST_RATE+"\n");
    }
}