import java.util.Date;

public class UberAdmin extends Employee {

    public UberAdmin(
            String department,
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
        this.department = department;
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

    String department;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "UberAdmin{" +
                "department='" + department + '\'' +
                '}';
    }
}
