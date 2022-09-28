import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.ZonedDateTime;

enum TrnStatus{
    SUCCESS,
    FAIL
}
class Transaction{
    private static int trnId = 4589;
    private ZonedDateTime trnBegTime;
    private ZonedDateTime trnEndTime;
    private TrnStatus trnStatus;
    private String trnMsg;
    private double amtBefTrn;
    private double amtAftTrn;
    private double amtCredit = 0;
    private double amtDebit = 0;
    private int accountNumber;
    private String ifscCode;

    Transaction(double amtBefTrn, double amtDebit, double amtCredit, int accountNumber, String ifscCode){
        this.amtBefTrn = amtBefTrn;
        this.amtDebit = amtDebit;
        this.amtCredit = amtCredit;
        this.accountNumber = accountNumber;
        this.ifscCode = ifscCode;
        trnId +=1;
    }


    void trnBegin(){
        trnBegTime = ZonedDateTime.now();
    }

    void trnEnd(TrnStatus trnStatus, String trnMsg, double amtAftTrn){
        trnEndTime = ZonedDateTime.now();
        this.trnStatus = trnStatus;
        this.trnMsg = trnMsg;
        this.amtAftTrn = amtAftTrn;
        trnLog();
    }

    private void trnLog(){
        try{
            String path = "/home/ayush/IdeaProjects/Bootcamp2022/Intro_To_Java_2/Logs/" + ifscCode + "/" + accountNumber + ".txt";
            //System.out.println(path);
            File file = new File(path);
            file.createNewFile();
            FileWriter myFile = new FileWriter("/home/ayush/IdeaProjects/Bootcamp2022/Intro_To_Java_2/Logs/"+ifscCode+"/"+accountNumber+".txt", true);
            BufferedWriter bw = new BufferedWriter(myFile);
            bw.write(trnId+"\t"+accountNumber+"\t"+trnBegTime+"\t"+trnEndTime+"\t"+amtBefTrn+"\t"+amtDebit+"\t"+amtCredit+"\t"+amtAftTrn+"\t"+trnStatus+"\t"+trnMsg);
            bw.newLine();
            bw.close();
            myFile.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
