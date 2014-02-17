package message.chains.solution;

public class Customer {

    private Address address;

    public Customer(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public boolean isInEurope() {
        return address.isInEurope();
    }

}
