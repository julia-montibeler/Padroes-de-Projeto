public class App {
    public static void main(String[] args) throws Exception {
        Beverage beverage = new DarkRoast();
        beverage.setSize("m");
        beverage = new Mocha(beverage);
        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());
    }
}
