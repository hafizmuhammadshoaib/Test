import java.util.List;
import java.util.Set;

public class Invoice {
    enum status {
        issued, paid
    }

    private String id;
    private int fromDate;
    private int toDate;
    private Customer customer;
    private List<Delivery> deliveries;
    private int totalCost;
    private int payDate;
    private Invoice.status status;

    public Invoice(String id, int fromDate, int toDate, Customer customer, List<Delivery> deliveries, int totalCost, int payDate) {
        this.id = id;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.customer = customer;
        this.deliveries = deliveries;
        this.totalCost = totalCost;
        this.payDate = payDate;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getFromDate() {
        return fromDate;
    }

    public void setFromDate(int fromDate) {
        this.fromDate = fromDate;
    }

    public int getToDate() {
        return toDate;
    }

    public void setToDate(int toDate) {
        this.toDate = toDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Delivery> getDeliveries() {
        return deliveries;
    }

    public void setDeliveries(List<Delivery> deliveries) {
        this.deliveries = deliveries;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    public int getPayDate() {
        return payDate;
    }

    public void setPayDate(int payDate) {
        this.payDate = payDate;
    }
}
