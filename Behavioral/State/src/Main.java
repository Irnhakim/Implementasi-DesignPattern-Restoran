public class Main {
    public static void main(String[] args) {
        OrderContext context = new OrderContext();
        context.setState(new CreatedState());
        context.applyState();
        context.setState(new CookedState());
        context.applyState();
        context.setState(new DeliveredState());
        context.applyState();
    }
}