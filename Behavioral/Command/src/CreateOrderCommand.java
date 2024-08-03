class CreateOrderCommand implements Command {
    private Order order;

    public CreateOrderCommand(Order order) {
        this.order = order;
    }

    @Override
    public void execute() {
        order.create();
    }
}