import java.util.Date;

public class Captain extends Employee{

    int drivingLicenseNo;
    int totalRides;
    double rating;

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
        this.empId = empId;
        this.empDesc = empDesc;
        this.onLeave = onLeave;
        this.id = id;
        this.name = name;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.phone = phone;
        this.address = address;
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
        return "Captain{" +
                "drivingLicenseNo=" + drivingLicenseNo +
                ", totalRides=" + totalRides +
                ", rating=" + rating +
                '}';
    }
}
