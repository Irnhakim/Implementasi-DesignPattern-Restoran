class OrderContext {
    private OrderState state;

    public void setState(OrderState state) {
        this.state = state;
    }

    public void applyState() {
        state.handleState();
    }
}