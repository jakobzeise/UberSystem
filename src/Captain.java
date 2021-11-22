import java.util.Date;

public class Captain extends Employee {

    private int drivingLicenseNo;
    private int totalRides;
    private double rating;

    public Captain(
            int drivingLicenseNo,
            int totalRides,
            double rating,
            int empId,
            String empDesc,
            Boolean onLeave,
            int id,
            String name,
            String email,
            Date dateOfBirth,
            char gender,
            int phone,
            String address
    ) {
        this.drivingLicenseNo = drivingLicenseNo;
        this.totalRides = totalRides;
        this.rating = rating;
        this.setEmpId(empId);
        this.setEmpDesc(empDesc);
        this.setOnLeave(onLeave);
        this.setId(id);
        this.setName(name);
        this.setEmail(email);
        this.setDateOfBirth(dateOfBirth);
        this.setGender(gender);
        this.setPhone(phone);
        this.setAddress(address);
        addCaptainToRiderWrite();


    }

    public void addCaptainToRiderWrite() {

    }

    public int getDrivingLicenseNo() {
        return drivingLicenseNo;
    }

    public void setDrivingLicenseNo(int drivingLicenseNo) {
        this.drivingLicenseNo = drivingLicenseNo;
    }

    public int getTotalRides() {
        return totalRides;
    }

    public void setTotalRides(int totalRides) {
        this.totalRides = totalRides;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
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
                        "\tEmployee ID=" + getEmpId() + "\n" +
                        "\tEmployee Description=" + getEmpDesc() + "\n" +
                        "\tOn Leave=" + getOnLeave() + "\n" +
                        "\tDriving LicenseNo=" + getDrivingLicenseNo() + "\n" +
                        "\tTotal Rides=" + getTotalRides() + "\n" +
                        "\tRating=" + getRating() + "\n ";
    }
}

