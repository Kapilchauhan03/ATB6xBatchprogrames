package ex_11052024_OOPs_mini_Project;

public class Payment {

    // Payment

    double amount;
    String paidBy;
    String modeOfPayment;

    public void cash (){
        System.out.println( "Cash is the mode of payment");
    }
    public void card (int cardNo){
        System.out.println("card is the mode of payment");
    }
    public int paymentID (){
        return 1001;
    }
    public String paidBy(String personName){
        return personName;
    }
}
