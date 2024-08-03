public class Main {
    public static void main(String[] args) {
        OrderHandler createOrderHandler = new CreateOrderHandler();
        OrderHandler processPaymentHandler = new ProcessPaymentHandler();
        OrderHandler arrangeDeliveryHandler = new ArrangeDeliveryHandler();

        createOrderHandler.setNextHandler(processPaymentHandler);
        processPaymentHandler.setNextHandler(arrangeDeliveryHandler);

        createOrderHandler.handleOrder();
    }
}