public class Main {
    public static void main(String[] args) {

        Food basicFood = new BasicFood();
        Food toppedFood = new ToppingDecorator(basicFood);

        System.out.println(toppedFood.getDescription() + " costs " + toppedFood.getCost());
    }
}