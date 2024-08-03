public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        Command createOrderCommand = new CreateOrderCommand(order);

        CommandInvoker invoker = new CommandInvoker();
        invoker.addCommand(createOrderCommand);
        invoker.executeCommands();
    }
}