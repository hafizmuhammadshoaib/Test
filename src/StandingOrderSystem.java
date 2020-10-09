import java.util.ArrayList;
import java.util.List;

public class StandingOrderSystem {
    private List<Product> productList;
    private List<Customer> customerList;
    private List<Order> orderList;
    private List<Delivery> deliveryList;
    private List<Invoice> invoiceList;
    private List<Address> addressList;

    public StandingOrderSystem() {
        productList = new ArrayList<>();
        customerList = new ArrayList<>();
        addressList = new ArrayList<>();
        orderList = new ArrayList<>();
    }

    public Product addProduct(String id, String description) throws Exception {
        if (searchProduct(id) == -1) {
            Product product = new Product(id, description);
            productList.add(product);
            return product;
        }
        throw new Exception("product with id " + id + " already exist");
    }

    public int searchProduct(String id) {
        for (int index = 0; index < productList.size(); index++) {
            Product product = productList.get(index);
            if (product.getId().equals(id)) {
                return index;
            }
        }
        return -1;
    }

    public void addCustomer(String id, String name,
                            String addressId, String line1, String line2, String contactPerson, String contactPhone,
                            String orderId,
                            String productId, String productDescription,
                            double price, List<Integer> quantities, int startDate, int endDate
    ) throws Exception {
        if (searchCustomer(id) == -1) {
            Address address = addAddress(addressId, line1, line2, contactPerson, contactPhone);
            List<Address> addresses = new ArrayList<>();
            addresses.add(address);
            Customer customer = new Customer(id, name, addresses);
            Product product = addProduct(productId, productDescription);
            Order order = addOrder(orderId, customer, address, product, price, quantities, startDate, endDate);
            customer.addOrder(order);
            customerList.add(customer);
            return;
        }
        throw new Exception("product with id " + id + " already exist");
    }

    public int searchCustomer(String id) {
        for (int index = 0; index < customerList.size(); index++) {
            Customer customer = customerList.get(index);
            if (customer.getId().equals(id)) {
                return index;
            }
        }
        return -1;
    }

    public Address addAddress(String id, String line1, String line2, String contactPerson, String contactPhone) throws Exception {
        if (searchAddress(id) == -1) {
            Address address = new Address(id, line1, line2, contactPerson, contactPhone);
            addressList.add(address);
            return address;
        }
        throw new Exception("address with id " + id + " already exist");
    }

    public int searchAddress(String id) {
        for (int index = 0; index < addressList.size(); index++) {
            Address address = addressList.get(index);
            if (address.getId().equals(id)) {
                return index;
            }
        }
        return -1;
    }

    public Order addOrder(String id, Customer customer, Address address, Product product, double price, List<Integer> quantities, int startDate, int endDate) throws Exception {
        if (searchOrder(id) == -1) {
            Order order = new Order(id, customer, address, product, price, quantities, startDate, endDate);
            orderList.add(order);
            return order;
        }
        throw new Exception("order with id " + id + " already exist");
    }

    public int searchOrder(String id) {
        for (int index = 0; index < orderList.size(); index++) {
            Order order = orderList.get(index);
            if (order.getId().equals(id)) {
                return index;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return "StandingOrderSystem{" +
                "productList=" + productList +
                ", orderList=" + orderList +
                ", deliveryList=" + deliveryList +
                ", invoiceList=" + invoiceList +
                ", addressList=" + addressList +
                ", customerList=" + customerList +
                '}';
    }
}
