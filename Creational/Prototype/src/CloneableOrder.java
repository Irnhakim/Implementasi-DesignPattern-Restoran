import java.util.ArrayList;
import java.util.List;

class CloneableOrder implements Cloneable {
    private List<String> items;

    public CloneableOrder(List<String> items) {
        this.items = items;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new CloneableOrder(new ArrayList<>(items));
    }

    public void showItems() {
        for (String item : items) {
            System.out.println(item);
        }
    }
}