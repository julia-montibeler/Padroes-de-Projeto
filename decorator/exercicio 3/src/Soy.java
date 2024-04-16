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
        if (beverage.getSize().equalsIgnoreCase("P")) {
            return beverage.cost()+0.60;
        }
        if (beverage.getSize().equalsIgnoreCase("M")) {
            return beverage.cost()+0.90;
        }
        if (beverage.getSize().equalsIgnoreCase("G")) {
            return beverage.cost()+1.20;
        }
        return 0;
    }

}
