import java.util.Date;

public class Account {
    private int id;
    private String name;
    private String email;
    private Date dateOfBirth;
    private char gender;
    private int phone;
    private String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return
                "Id=" + id +
                ", Name='" + name + '\'' +
                ", Email='" + email + '\'' +
                ", DateOfBirth=" + dateOfBirth +
                ", Gender=" + gender +
                ", Phone=" + phone +
                ", Address='" + address + '\'';
    }
}
