class BOI extends Bank{
    private static int accountNumber = 2000;
    private static final String IFSC = "BOI0003";
    private static final double INTEREST_RATE = 4.00;

    public BOI(String accountHolderName, AccType accountType, double totalBalance) {
        super(accountNumber, IFSC, accountHolderName, accountType, INTEREST_RATE, totalBalance);
        accountNumber += 1;
    }

    public void getDetails(){
        System.out.println("--------BOI Bank Details--------- \nIFSC - "+IFSC+"\nInterest Rate - "+INTEREST_RATE+"\n");
    }

}
