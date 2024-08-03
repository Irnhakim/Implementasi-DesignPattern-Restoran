class ArrangeDeliveryHandler extends OrderHandler {
    @Override
    public void handleOrder() {
        System.out.println("Arranging delivery...");
        super.handleOrder();
    }
}