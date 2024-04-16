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
        if (beverage.getSize().equalsIgnoreCase("P")) {
            return beverage.cost()+0.70;
        }
        if (beverage.getSize().equalsIgnoreCase("M")) {
            return beverage.cost()+1.05;
        }
        if (beverage.getSize().equalsIgnoreCase("G")) {
            return beverage.cost()+1.40;
        }
        return 0;
    }

}
