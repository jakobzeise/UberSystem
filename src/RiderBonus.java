public class RiderBonus {
    int bonusId;
    String bonusDesc;
    double bonusCredit;

    public RiderBonus(int bonusId, String bonusDesc, double bonusCredit) {
        this.bonusId = bonusId;
        this.bonusDesc = bonusDesc;
        this.bonusCredit = bonusCredit;
    }

    public int getBonusId() {
        return bonusId;
    }

    public void setBonusId(int bonusId) {
        this.bonusId = bonusId;
    }

    public String getBonusDesc() {
        return bonusDesc;
    }

    public void setBonusDesc(String bonusDesc) {
        this.bonusDesc = bonusDesc;
    }

    public double getBonusCredit() {
        return bonusCredit;
    }

    public void setBonusCredit(double bonusCredit) {
        this.bonusCredit = bonusCredit;
    }

    @Override
    public String toString() {
        return "RiderBonus{" +
                "bonusId=" + bonusId +
                ", bonusDesc='" + bonusDesc + '\'' +
                ", bonusCredit=" + bonusCredit +
                '}';
    }
}
