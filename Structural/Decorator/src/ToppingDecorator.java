class ToppingDecorator extends FoodDecorator {
    public ToppingDecorator(Food decoratedFood) {
        super(decoratedFood);
    }

    @Override
    public String getDescription() {
        return decoratedFood.getDescription() + ", with extra topping";
    }

    @Override
    public double getCost() {
        return decoratedFood.getCost() + 2.0;
    }
}