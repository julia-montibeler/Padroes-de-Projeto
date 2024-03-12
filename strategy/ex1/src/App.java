public class App {
    public static void main(String[] args) throws Exception {
        Duck duck = new RubberDuck();

        duck.performFly();
        duck.performQuack();
    }
}
