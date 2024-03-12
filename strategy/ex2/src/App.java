public class App {
    public static void main(String[] args) throws Exception {
        Barco b1 = new Bateira();
        b1.mover();
        Barco b2 = new Canoa();
        b2.mover();
        Barco b3 = new BarcoVela();
        b3.mover();
    }
}
