import java.util.List;

// Order.java
class Order {
    private List<String> items;

    public Order(List<String> items) {
        this.items = items;
    }

    public void showItems() {
        for (String item : items) {
            System.out.println(item);
        }
    }
}