public class Main {
    public static void main(String[] args) {

        MenuComponent pasta = new MenuItem("Pasta");
        MenuComponent wine = new MenuItem("Wine");

        MenuComponent dinnerMenu = new Menu("Dinner Menu");
        dinnerMenu.add(pasta);
        dinnerMenu.add(wine);

        dinnerMenu.print();
    }
}