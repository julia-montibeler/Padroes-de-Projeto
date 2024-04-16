public class App {
    public static void main(String[] args) throws Exception {
        Beverage beverage = new DarkRoast();
        beverage.setSize("L");
        beverage = new Mocha(beverage);
        beverage = new CoffeeDose(beverage, 2);
        System.out.println(beverage.getDescription());
    }
}
