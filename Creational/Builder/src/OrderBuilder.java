import java.util.ArrayList;
import java.util.List;

// OrderBuilder.java
class OrderBuilder {
    private List<String> items = new ArrayList<>();

    public OrderBuilder addItem(String item) {
        items.add(item);
        return this;
    }

    public Order build() {
        return new Order(items);
    }
}