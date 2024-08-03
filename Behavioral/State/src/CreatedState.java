class CreatedState implements OrderState {
    @Override
    public void handleState() {
        System.out.println("Order is created.");
    }
}