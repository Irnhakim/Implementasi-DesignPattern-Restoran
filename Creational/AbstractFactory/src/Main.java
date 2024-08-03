public class Main {
    public static void main(String[] args) {
        FoodFactory italianFoodFactory = new ItalianFoodFactory();
        MainCourse mainCourse = italianFoodFactory.createMainCourse();
        Beverage beverage = italianFoodFactory.createBeverage();
        System.out.println(mainCourse.getName() + " and " + beverage.getName());
    }
}