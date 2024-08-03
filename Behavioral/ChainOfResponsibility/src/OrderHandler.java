abstract class OrderHandler {
    protected OrderHandler nextHandler;

    public void setNextHandler(OrderHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handleOrder() {
        if (nextHandler != null) {
            nextHandler.handleOrder();
        }
    }
}