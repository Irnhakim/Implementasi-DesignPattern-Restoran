class ItalianFoodFactory implements FoodFactory {
    @Override
    public MainCourse createMainCourse() {
        return new Pasta();
    }

    @Override
    public Beverage createBeverage() {
        return new Wine();
    }
}