class CookedState implements OrderState {
    @Override
    public void handleState() {
        System.out.println("Order is cooked.");
    }
}