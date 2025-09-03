abstract class Payment {
    double amount;
    String transactionId;
    Payment(double amount, String transactionId) {
        this.amount = amount;
        this.transactionId = transactionId;
    }
     void generateslip(){
        System.out.println("Receiptno: " + transactionId + " for amount " + amount);
    }
}
interface Refundable {
    void refund(double amount);
}
class done extends Payment implements Refundable{
    done(double amount, String transactionId) {
        super(amount, transactionId);
    }
      public void refund(double refund) {
        System.out.println("Refund of " + refund + " initiated for Transaction: " + transactionId);
    }
}
class notcancel extends Payment {
     notcancel(double amount, String transactionId) {
        super(amount, transactionId);
        System.out.println("Does not support cancel or schedule");
}
}
public class Test{
    public static void main(String[] args) {
        done cab=new done(500,"CAB101");
         done train=new done(1200,"TRN202");
          done bus=new done(200,"BUS303");
            cab.generateslip();
            cab.refund(300); 
            train.generateslip();
            train.refund(1000); 
            bus.generateslip();
            bus.refund(0);
            
    }
}