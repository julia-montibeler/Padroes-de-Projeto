public class App {
    public static void main(String[] args) throws Exception {
        GumballMachine gm = new GumballMachine(3);
        gm.state.inserirMoeda();
        gm.state.virarManivela();
        gm.state.entregar();
        gm.state.virarManivela();
        gm.state.entregar();
    }
}
