import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String id;
    private String name;
    private List<Address> addresses;
    private List<Order> orders;

    public Customer(String id, String name, List<Address> addresses) {
        this.id = id;
        this.name = name;
        this.addresses = addresses;
        this.orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        if (order != null)
            orders.add(order);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", addresses=" + addresses +
                ", orders=" + orders +
                '}';
    }
}
