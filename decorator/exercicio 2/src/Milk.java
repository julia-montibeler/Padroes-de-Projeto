public class Milk extends CondimentDecorator{

    Beverage beverage;

    Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", milk";
    }

    @Override
    public double cost() {
        if (beverage.getSize().equalsIgnoreCase("P")) {
            return beverage.cost()+0.20;
        }
        if (beverage.getSize().equalsIgnoreCase("M")) {
            return beverage.cost()+0.30;
        }
        if (beverage.getSize().equalsIgnoreCase("G")) {
            return beverage.cost()+0.40;
        }
        return 0;
    }

    

}
