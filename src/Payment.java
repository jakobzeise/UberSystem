public class Payment {

    int paymentId;
    String paymentDesc;
    double paymentAmount;

    Payment(int paymentId, String paymentDesc, double paymentAmount){
        this.paymentId = paymentId;
        this.paymentDesc = paymentDesc;
        this.paymentAmount = paymentAmount;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public String getPaymentDesc() {
        return paymentDesc;
    }

    public void setPaymentDesc(String paymentDesc) {
        this.paymentDesc = paymentDesc;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentId=" + paymentId +
                ", paymentDesc='" + paymentDesc + '\'' +
                ", paymentAmount=" + paymentAmount +
                '}';
    }
}
