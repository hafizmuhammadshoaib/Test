import java.util.List;

public class Delivery {
    private String id;
    private Customer customer;
    private Address address;
    private int date;
    private int dayOfWeek;
    private List<DeliveryItem> deliveryItems;

    public Delivery(String id, Customer customer, Address address, int date, int dayOfWeek, List<DeliveryItem> deliveryItems) {
        this.id = id;
        this.customer = customer;
        this.address = address;
        this.date = date;
        this.dayOfWeek = dayOfWeek;
        this.deliveryItems = deliveryItems;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(int dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public List<DeliveryItem> getDeliveryItems() {
        return deliveryItems;
    }

    public void setDeliveryItems(List<DeliveryItem> deliveryItems) {
        this.deliveryItems = deliveryItems;
    }
}
