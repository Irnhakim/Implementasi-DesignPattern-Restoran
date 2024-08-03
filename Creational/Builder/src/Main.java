public class Main {
    public static void main(String[] args) {

        OrderBuilder orderBuilder = new OrderBuilder();
        Order order = orderBuilder.addItem("Pasta").addItem("Wine").build();
        order.showItems();
    }
}