import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        CloneableOrder originalOrder = new CloneableOrder(Arrays.asList("Pasta", "Wine"));
        CloneableOrder clonedOrder = (CloneableOrder) originalOrder.clone();
        clonedOrder.showItems();
    }
}
