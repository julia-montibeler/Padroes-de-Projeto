public class App {
    public static void main(String[] args) throws Exception {
        DarkRoast dk = new DarkRoast();
        Mocha m = new Mocha(dk);
        System.out.println(m.getDescription());
        System.out.println(m.cost());;
    }
}
