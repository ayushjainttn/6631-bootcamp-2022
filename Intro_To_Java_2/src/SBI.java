class SBI extends Bank{

    private static int accountNumber = 1000;
    private static final String IFSC = "SBIN0001";
    private static final double INTEREST_RATE = 3.75;

    public SBI(String accountHolderName, AccType accountType, double totalBalance) {
        super(accountNumber, IFSC, accountHolderName, accountType, INTEREST_RATE, totalBalance);
        accountNumber += 1;
    }

    public void getDetails(){
        System.out.println("--------SBI Bank Details--------- \nIFSC - "+IFSC+"\nInterest Rate - "+INTEREST_RATE+"\n");
    }

}