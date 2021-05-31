package Constructor;

public class Address {
    private int StreetNo;
    private String streetName;
    private String city;
    private String country;
    private int ZipCode;

    public Address(){
        this.country="Canada";
    }



    public Address(int streetNo, String streetName, String city, String country, int zipCode) {
        this();
        StreetNo = streetNo;
        this.streetName = streetName;
        this.city = city;
        ZipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "StreetNo=" + StreetNo +
                ", streetName='" + streetName + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", ZipCode=" + ZipCode +
                '}';
    }
}
