import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Rider extends Account {

    private double walletBalance;
    private String pickupForm;
    private String dropTo;
    private double distance;
    private Captain captain;
    private UberAdmin uberAdmin;
    private ArrayList<Payment> payment;
    private ArrayList<RiderBonus> riderBonus;
    //TODO get the Arrays Right
    private Ride ride;
    private Date joinDate;
    private double rating;


    //Constructor of the Rider class
    public Rider(double walletBalance,
                 String pickupForm,
                 String dropTo,
                 double distance,
                 Date joinDate,
                 double rating,
                 int id,
                 String name,
                 String email,
                 Date dateOfBirth,
                 char gender,
                 int phone,
                 String address
    ) {
        this.walletBalance = walletBalance;
        this.pickupForm = pickupForm;
        this.dropTo = dropTo;
        this.distance = distance;
        this.joinDate = joinDate;
        this.rating = rating;
        this.setId(id);
        this.setName(name);
        this.setEmail(email);
        this.setDateOfBirth(dateOfBirth);
        this.setGender(gender);
        this.setPhone(phone);
        this.setAddress(address);

    }


    int getTotalBonus() {
        // TODO: 21.11.21 get Total Bonus
        return 0;
    }

    int getTotalPayment() {
        // TODO: 21.11.21 get Total Payment
        return 0;
    }

    public double getWalletBalance() {
        return walletBalance;
    }

    public String getPickupForm() {
        return pickupForm;
    }

    public String getDropTo() {
        return dropTo;
    }

    public double getDistance() {
        return distance;
    }

    public Captain getCaptain() {
        return captain;
    }

    public UberAdmin getUberAdmin() {
        return uberAdmin;
    }

    public Payment getPayment(Payment payment, int index) {
        return payment;
    }

    public RiderBonus getRiderBonus(int index) {
        return riderBonus.get(index);
    }

    public Ride getRide() {
        return ride;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public double getRating() {
        return rating;
    }

    public void setWalletBalance(double walletBalance) {
        this.walletBalance = walletBalance;
    }

    public void setPickupForm(String pickupForm) {
        this.pickupForm = pickupForm;
    }

    public void setDropTo(String dropTo) {
        this.dropTo = dropTo;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void setCaptain(Captain captain) {
        this.captain = captain;
    }

    public void setUberAdmin(UberAdmin uberAdmin) {
        this.uberAdmin = uberAdmin;
    }

    public void setPayment(ArrayList<Payment> payment) {
        this.payment = payment;
    }

    public void setPayment(Payment payment, int index) {
        this.payment.add(index, payment);
    }

    public void setRiderBonus(ArrayList<RiderBonus> riderBonus) {
        this.riderBonus = riderBonus;
    }

    public void setRiderBonus(RiderBonus riderBonus, int index) {
        this.riderBonus.add(index, riderBonus);
    }

    public void setRide(Ride ride) {
        this.ride = ride;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double calNetPayment() {
        // TODO: 21.11.21 calculate the net Payment
        return 0;
    }

    public String printRiderBasicInfo() {
        // TODO: 21.11.21 printRiderBasicInfo
        return "";
    }

    Formatter formatter;

    public void printReport(){
        try {
             formatter = new Formatter("RiderReports/" + getId() +
                    getName().charAt(0) + getName().charAt(1) + getName().charAt(2) +
                    "_Rider_Report" + ".txt");

            String timeStamp = new SimpleDateFormat("yyyy MMM dd HH:mm:ss.SSS zzz").format(Calendar.getInstance().getTime());

            formatter.format("%s", "------------------ Welcome to Uber ------------------\n\n" +
                    "--------- Current Date :  " + timeStamp + "--------\n\n" +
                    "Command Assign_Payment_Rider:\n" +
                    "Successfully Processed by the System, Following are the details:\n\n" +
                    "--- Rider Detail are as Follows: ---\n\n" +
                    this + "\n\n" +
                    "------------------------------------\n\n" +
                    "--- Captain Detail are as Follows: ---\n\n" +
                    getCaptain()+ "\n\n" +
                    "------------------------------------\n\n" +
                    "--- UberAdmin Detail are as Follows: ---\n\n" +
                    getUberAdmin()+ "\n\n" +
                    "------------------------------------\n\n"



                    //TODO Finish the Report for the Riders


            );
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        formatter.close();
    }

    @Override
    public String toString() {
        return
                "\tID=" + getId() + "\n" +
                        "\tName=" + getName() + "\n" +
                        "\tEmail=" + getEmail() + "\n" +
                        "\tDate of Birth=" + getDateOfBirth() + "\n" +
                        "\tGender=" + getGender() + "\n" +
                        "\tPhone=" + getPhone() + "\n" +
                        "\tAddress=" + getAddress() + "\n\n" +
                        "------------------------------------" + "\n" + "\n" +
                        "\tWalletBalance=" + getWalletBalance() + "\n" + "\n" +
                        "\tPickupForm='" + getPickupForm() + "\n" + "\n" +
                        "\tDropTo='" + getDropTo() + '\'' + "\n" + "\n" +
                        "\tDistance=" + getDistance() + "\n" + "\n" +
                        "\tRating=" + getRating();
    }
}
