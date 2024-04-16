public class CoffeeDose extends DoseDecorator{
    Beverage beverage;
    int numDoses;

    CoffeeDose(Beverage beverage, int doses) {
        this.beverage = beverage;
        numDoses = doses;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", "+numDoses+" Coffee Doses";
    }

    @Override
    public double cost() {
        return beverage.cost() + (numDoses * 0.1);
    }
    

}
