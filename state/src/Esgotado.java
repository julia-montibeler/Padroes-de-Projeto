public class Esgotado implements State{

    GumballMachine gumballMachine;

    Esgotado(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void inserirMoeda() {
        System.out.println("A máquina está vazia");
    }

    @Override
    public void ejetarMoeda() {
        System.out.println("Você não inseriu uma moeda");
    }

    @Override
    public void virarManivela() {
        System.out.println("A máquina está vazia");
    }

    @Override
    public void entregar() {
        System.out.println("Nenhuma bolinha foi fornecida");
    }

}
