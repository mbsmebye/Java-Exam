package Oppgave1;

public class Address {
    
    private String street;
    private String postcode;
    private String country;

    public Address() {}
    
    public Address(String street, String postcode, String country) {
        this.street = street;
        this.postcode = postcode;
        this.country = country;
    }

    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostcode() {
        return this.postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String toString() {
        return "Street: " + this.street + "\nPostcode: " + this.postcode + "\nCountry: " + this.country;
    }
}