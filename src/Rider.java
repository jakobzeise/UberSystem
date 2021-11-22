import java.util.Date;

public class Rider extends Account {

    private double walletBalance;
    private String pickupForm;
    private String dropTo;
    private double distance;
    private Captain captain;
    private UberAdmin uberAdmin;
    private Payment payment;
    private RiderBonus riderBonus;
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

    public RiderBonus getRiderBonus() {
        return riderBonus;
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

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public void setPayment(Payment payment, int index) {
        this.payment = payment;
    }

    public void setRiderBonus(RiderBonus riderBonus) {
        this.riderBonus = riderBonus;
    }

    public void setRiderBonus(RiderBonus riderBonus, int index) {
        this.riderBonus = riderBonus;
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

    @Override
    public String toString() {
        return
                "\tID=" + getId() + "\n" +
                        "\tName=" + getName() + "\n" +
                        "\tEmail=" + getEmail() + "\n" +
                        "\tDate of Birth=" + getDateOfBirth() + "\n" +
                        "\tGender=" + getGender() + "\n" +
                        "\tPhone=" + getPhone() + "\n" +
                        "\tAddress=" + getAddress() + "\n" +
                        "------------------------------------" + "\n" + "\n" +
                        "\tWalletBalance=" + getWalletBalance() + "\n" + "\n" +
                        "\tPickupForm='" + getPickupForm() + "\n" + "\n" +
                        "\tDropTo='" + getDropTo() + '\'' + "\n" + "\n" +
                        "\tDistance=" + getDistance() + "\n" + "\n" +
                        "\tRating=" + getRating();
    }
}
