public class Soy extends CondimentDecorator{
    Beverage beverage;

    Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", soy milk";
    }

    @Override
    public double cost() {
        return beverage.cost()+0.60;
    }

}
