import java.util.Date;

public class Rider extends Account{

    double walletBalance;
    String pickupForm;
    String dropTo;
    double distance;
    Captain captain;
    UberAdmin uberAdmin;
    Payment payment;

    //Constructor of the Rider class
    public Rider(double walletBalance,
                 String pickupForm,
                 String dropTo,
                 double distance,
                 Captain captain,
                 UberAdmin uberAdmin,
                 Payment payment,
                 RiderBonus riderBonus,
                 Ride ride,
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
        this.captain = captain;
        this.uberAdmin = uberAdmin;
        this.payment = payment;
        this.riderBonus = riderBonus;
        this.ride = ride;
        this.joinDate = joinDate;
        this.rating = rating;
        this.id = id;
        this.name = name;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.phone = phone;
        this.address = address;
    }

    RiderBonus riderBonus;
    Ride ride;
    Date joinDate;
    double rating;

    int getTotalBonus(){
        // TODO: 21.11.21 get Total Bonus
        return 0;
    }

    int getTotalPayment(){
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
    
    public double calNetPayment(){
        // TODO: 21.11.21 calculate the net Payment
        return 0;
    }

    public String printRiderBasicInfo(){
        // TODO: 21.11.21 printRiderBasicInfo
        return "";
    }

    @Override
    public String toString() {
        return "Rider{" +
                "walletBalance=" + walletBalance +
                ", pickupForm='" + pickupForm + '\'' +
                ", dropTo='" + dropTo + '\'' +
                ", distance=" + distance +
                ", captain=" + captain +
                ", uberAdmin=" + uberAdmin +
                ", payment=" + payment +
                ", riderBonus=" + riderBonus +
                ", ride=" + ride +
                ", joinDate=" + joinDate +
                ", rating=" + rating +
                '}';
    }
}
