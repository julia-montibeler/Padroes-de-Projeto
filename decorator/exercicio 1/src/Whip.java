public class Whip extends CondimentDecorator{
    Beverage beverage;

    Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", whipped cream";
    }

    @Override
    public double cost() {
        return beverage.cost()+0.70;
    }

}
