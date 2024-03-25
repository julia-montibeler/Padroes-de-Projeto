public class App {
    public static void main(String[] args) throws Exception {
        Imovel a = new Casa(5, 'A', 90);
        Imovel b = new Terreno(0, 'C', 400);

        System.out.println(a.definirValor());
        System.out.println(b.definirValor());
    }
}
