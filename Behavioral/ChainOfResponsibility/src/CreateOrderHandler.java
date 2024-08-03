class CreateOrderHandler extends OrderHandler {
    @Override
    public void handleOrder() {
        System.out.println("Creating order...");
        super.handleOrder();
    }
}