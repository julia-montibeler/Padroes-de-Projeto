public class RubberDuck extends Duck{
    RubberDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new Squeak());

    }

    @Override
    public void display() {
        System.out.println("Rubber duck");
    }

}
