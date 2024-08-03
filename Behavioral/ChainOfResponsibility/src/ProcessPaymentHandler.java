class ProcessPaymentHandler extends OrderHandler {
    @Override
    public void handleOrder() {
        System.out.println("Processing payment...");
        super.handleOrder();
    }
}