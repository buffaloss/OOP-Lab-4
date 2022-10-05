// Location will have the city the school is located in, and the full addres stored as a string
public class Location extends School {
    private String city;
    private String address;


    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String adress) {
        this.address = adress;
    }

}