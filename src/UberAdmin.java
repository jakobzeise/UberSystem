import java.util.Date;

public class UberAdmin extends Employee {

    private String department;

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

    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
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
                        "\tDepartment=" + getDepartment() + "\n ";
    }
}
