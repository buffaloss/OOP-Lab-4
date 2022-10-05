public class School extends Entity {

    private String name;
    private int surface; // in square meters
    private int annualFunds;


    public String exist() {
        String existence = "Exists";
        return existence;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSurface() {
        return this.surface;
    }

    public void setSurface(int surface) {
        this.surface = surface;
    }

    public int getAnnualFunds() {
        return this.annualFunds;
    }

    public void setAnnualFunds(int annualFunds) {
        this.annualFunds = annualFunds;
    }

    //modify annual funds by adding or subtrracting from current annual funds
    public void modifyAnnualFunds(int annualFunds){
        this.annualFunds = this.annualFunds+annualFunds;
    }

}