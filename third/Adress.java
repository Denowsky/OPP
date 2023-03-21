package third;

public class Adress {
    String city;
    String street;
    String building;
    String houseNumber;

    public Adress(String city, String street, String building, String houseNumber) {
        this.city = city;
        this.street = street;
        this.building = building;
        this.houseNumber = houseNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }
    
    @Override
    public String toString() {
        return String.format("г.%s, ул.%s д.%s кв.%s", city, street, building, houseNumber);
    }
}
