package pl.sda.pol141.day1.aggregation;

/**
 * Przykład agregatu
 */
public class Customer {
    public final String firstName;
    public final String lastName;

    public final Address contactAddress;

    public final Address deliveryAddress;

    public Customer(String firstName, String lastName, Address contactAddres, Address deliveryAddres) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactAddress = contactAddres;
        this.deliveryAddress = deliveryAddres;
    }
}
