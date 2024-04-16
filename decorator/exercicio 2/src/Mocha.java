public class Mocha extends CondimentDecorator{

    Beverage beverage;

    Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", mocha";
    }

    @Override
    public double cost() {
        if (beverage.getSize().equalsIgnoreCase("P")) {
            return beverage.cost()+0.50;
        }
        if (beverage.getSize().equalsIgnoreCase("M")) {
            return beverage.cost()+0.75;
        }
        if (beverage.getSize().equalsIgnoreCase("G")) {
            return beverage.cost()+1.0;
        }
        return 0;
    }

}
