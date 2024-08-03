import java.util.ArrayList;
import java.util.List;

class Menu extends MenuComponent {
    private List<MenuComponent> menuComponents = new ArrayList<>();
    private String name;

    public Menu(String name) {
        this.name = name;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println("\n" + getName());
        System.out.println("---------------------");

        for (MenuComponent menuComponent : menuComponents) {
            menuComponent.print();
        }
    }
}