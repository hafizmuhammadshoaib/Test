import java.util.List;

public class Order {

    enum status {
        closed,
        active
    }

    private String id;
    private Customer customer;
    private Address address;
    private Product product;
    private double price;
    private List<Integer> quantities;
    private int startDate;
    private int endDate;

    private status orderStatus;

    public Order(String id, Customer customer, Address address, Product product, double price, List<Integer> quantities, int startDate, int endDate) throws Exception {
        if (price > 0) {
            this.id = id;
            this.customer = customer;
            this.address = address;
            this.product = product;
            this.price = price;
            this.quantities = quantities;
            this.startDate = startDate;
            this.endDate = endDate;
            this.orderStatus = Order.status.active;
            return;
        }
        throw new Exception("price must be real value "+ price );
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

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Integer> getQuantities() {
        return quantities;
    }

    public void setQuantities(List<Integer> quantities) {
        this.quantities = quantities;
    }

    public int getStartDate() {
        return startDate;
    }

    public void setStartDate(int startDate) {
        this.startDate = startDate;
    }

    public int getEndDate() {
        return endDate;
    }

    public void setEndDate(int endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", price=" + price +
                ", quantities=" + quantities +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", orderStatus=" + orderStatus +
                '}';
    }
}
