class OrderFacade {
    private PaymentSystem paymentSystem = new PaymentSystem();
    private DeliverySystem deliverySystem = new DeliverySystem();
    private ReportingSystem reportingSystem = new ReportingSystem();

    public void placeOrder() {
        paymentSystem.processPayment();
        deliverySystem.arrangeDelivery();
        reportingSystem.generateReport();
    }
}