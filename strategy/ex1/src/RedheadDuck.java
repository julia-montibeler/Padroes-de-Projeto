public class RedheadDuck extends Duck{

    RedheadDuck() {
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }

    @Override
    public void display() {
        System.out.println("Redhead duck");
    }
}
