public class SemCredito implements State{

    GumballMachine gumballMachine;

    SemCredito(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void inserirMoeda() {
        System.out.println("Moeda inserida");
        gumballMachine.setState(gumballMachine.getComCredito());

    }

    @Override
    public void ejetarMoeda() {
        System.out.println("Você não inseriu nenhuma moeda");

    }

    @Override
    public void virarManivela() {
        System.out.println("Você acionou a alavanca, mas não inseriu nenhuma moeda");
    }

    @Override
    public void entregar() {
        System.out.println("Você acionou a alavanca, mas não inseriu nenhuma moeda");
    }

}
