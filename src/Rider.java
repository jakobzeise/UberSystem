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
    private ArrayList<Payment> payments;
    private ArrayList<RiderBonus> riderBonuses;
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

        payments = new ArrayList<>();
        riderBonuses = new ArrayList<>();
        for (int q = 0; q < 25; q++) {
            payments.add(new Payment(0, "", 0.0));
            riderBonuses.add(new RiderBonus(0, "", 0.0));
        }

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

    public Payment getPayment(int index) {
        return payments.get(index);
    }

    public String getAllPayments() {
        StringBuilder allPayments = new StringBuilder();
        for (Payment payment : payments) {
            if (payment.getPaymentAmount() > 0) {
                allPayments
                        .append("\tPaymentId: ")
                        .append(payment.getPaymentId())
                        .append("\n").append("\tPaymentDesc: ")
                        .append(payment.getPaymentDesc())
                        .append("\n")
                        .append("\tPaymentAmount: ")
                        .append(payment.getPaymentAmount())
                        .append("\n\n");
            }
        }
        return allPayments.toString();
    }

    public String getAllBonuses() {
        StringBuilder allBonuses = new StringBuilder();
        for (RiderBonus riderBonus : riderBonuses) {
            if (riderBonus.getBonusCredit() > 0) {
                allBonuses.append("\tBonusId: ")
                        .append(riderBonus.getBonusId())
                        .append("\n").append("\tBonusDesc: ")
                        .append(riderBonus.getBonusDesc())
                        .append("\n").append("\tBonusDesc: ")
                        .append(riderBonus.getBonusCredit())
                        .append("\n\n");
            }
        }
        return allBonuses.toString();
    }

    public RiderBonus getRiderBonus(int index) {
        return riderBonuses.get(index);
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

    public void setPayments(ArrayList<Payment> payments) {
        this.payments = payments;
    }

    public void setPayment(Payment payment, int index) {
        this.payments.set(index, payment);
    }

    public void setRiderBonuses(ArrayList<RiderBonus> riderBonuses) {
        this.riderBonuses = riderBonuses;
    }

    public void setRiderBonus(RiderBonus riderBonus, int index) {
        this.riderBonuses.set(index, riderBonus);
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
        double totalBonus = 0;
        for (RiderBonus bonus : riderBonuses) {
            totalBonus += bonus.getBonusCredit();
        }
        double totalPayment = 0;
        for (Payment payment : payments) {
            totalPayment += payment.getPaymentAmount();
        }
        return totalPayment - totalBonus;
    }

    public String printRiderBasicInfo() {
        return this.toString();
    }

    Formatter formatter;

    public void printReport() {
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
                    this + "\n" +
                    "------------------------------------\n\n" +
                    "--- Captain Detail are as Follows: ---\n\n" +
                    getCaptain() + "\n" +
                    "------------------------------------\n\n" +
                    "--- UberAdmin Detail are as Follows: ---\n\n" +
                    getUberAdmin() + "\n" +
                    "------------------------------------\n" +
                    "--- Payment Detail are as Follows: ---\n\n" +
                    getAllPayments() +
                    "------------------------------------\n" +
                    "--- Bonus Detail are as Follows: ---\n\n" +
                    getAllBonuses() +
                    "------------------------------------\n" +
                    "--- Ride Detail are as Follows: ---\n\n" +
                    getRide() +
                    "------------------------------------\n" +
                    "--- Total Net Payment: " + calNetPayment());

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
