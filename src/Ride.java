public class Ride {

    private int rideID;
    private String rideType;
    private int noOfSeats;
    private String registrationNo;

    public Ride(int rideID, String rideType, int noOfSeats, String registrationNo) {
        this.rideID = rideID;
        this.rideType = rideType;
        this.noOfSeats = noOfSeats;
        this.registrationNo = registrationNo;
    }

    public int getRideID() {
        return rideID;
    }

    public void setRideID(int rideID) {
        this.rideID = rideID;
    }

    public String getRideType() {
        return rideType;
    }

    public void setRideType(String rideType) {
        this.rideType = rideType;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public String getRegistrationNo() {
        return registrationNo;
    }

    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    @Override
    public String toString() {
        return
                        "\trideID=" + getRideID() + "\n" +
                        "\trideType='" + getRideType() + '\'' + "\n" +
                        "\tnoOfSeats=" + getNoOfSeats() + "\n" +
                        "\tregistrationNo='" + getRegistrationNo() + '\'' + "\n";
    }
}
