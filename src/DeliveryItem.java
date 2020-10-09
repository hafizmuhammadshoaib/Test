public class DeliveryItem {
    private Order order;
    private int quantity;
    private int difference;

    public DeliveryItem(Order order, int quantity, int difference) {
        this.order = order;
        this.quantity = quantity;
        this.difference = difference;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getDifference() {
        return difference;
    }

    public void setDifference(int difference) {
        this.difference = difference;
    }
}
