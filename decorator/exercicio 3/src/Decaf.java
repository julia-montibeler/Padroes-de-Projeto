public class Decaf extends Beverage{
    Decaf() {
        description = "decaffeinated";
    }

    @Override
    public double cost() {
        return 2.5;
    }
}
