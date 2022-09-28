enum AccType{
    SAVINGS,
    CURRENT
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
        Transaction t = new Transaction(totalBalance, amount, 0, accountNumber, ifscCode);
        t.trnBegin();
        System.out.println("-------------Transaction--------------");
        if(amount>totalBalance){
            t.trnEnd(TrnStatus.FAIL, "Failed due to Insufficient Balance", totalBalance);
            throw new InsufficientAmountException("Not enough balance. Transaction Failed!\n");
        }else{
            totalBalance = totalBalance - amount;
            t.trnEnd(TrnStatus.SUCCESS, "Amount debit successfully", totalBalance);
            System.out.println("Amount debited successfully.\n");
        }
    }

    public void creditAmount(double amount){
        Transaction t = new Transaction(totalBalance, 0, amount, accountNumber, ifscCode);
        t.trnBegin();
        System.out.println("-------------Transaction--------------");
        totalBalance = totalBalance+amount;
        t.trnEnd(TrnStatus.SUCCESS, "Amount credit success", totalBalance);
        System.out.println("Amount credited successfully\n");
    }
}