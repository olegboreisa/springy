package lt.boreisa.model;

public class Address {

    private String city;
    private String state;
    private String country;

    public Address () {} // Default Constr.


    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public void anyMethod () {
        System.out.println("[ADDRESS CLASS] Calling anyMethod () method!");
    }

    public String toString () {
        return String.format("%s, %s, %s!", city, state, country);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
