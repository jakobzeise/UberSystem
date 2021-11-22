public class Employee extends Account {

    private int empId;
    private String empDesc;
    private Boolean onLeave;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpDesc() {
        return empDesc;
    }

    public void setEmpDesc(String empDesc) {
        this.empDesc = empDesc;
    }

    public Boolean getOnLeave() {
        return onLeave;
    }

    public void setOnLeave(Boolean onLeave) {
        this.onLeave = onLeave;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empDesc='" + empDesc + '\'' +
                ", onLeave=" + onLeave +
                '}';
    }

}
