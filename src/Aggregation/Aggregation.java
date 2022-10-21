package Aggregation;

class Address {
    String city, state, country;

    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }
}

class Emp {
    int id;
    String name;
    Address address;

    public Emp(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;

    }

    void display() {
        System.out.println(id + " " + name + " " + address.city+" "+address.state+" "+address.country);
    }

    public static void main(String[] args) {

        Address a1 = new Address("VPM", "TN", "INDIA");

        Emp e = new Emp(101, "Venkat", a1);
        e.display();
    }
}