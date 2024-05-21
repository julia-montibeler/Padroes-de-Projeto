public class Vencedor implements State{

    GumballMachine gumballMachine;

    Vencedor(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void inserirMoeda() {
        System.out.println("Aguarde enquanto a máquina lhe oferece uma bolinha");

    }

    @Override
    public void ejetarMoeda() {
        System.out.println("Você já acionou a alavanca");
    }

    @Override
    public void virarManivela() {
        System.out.println("Acionar a alavanca outra vez não lhe dará outra bolinha");
    }

    @Override
    public void entregar() {
        System.out.println("Bolinha fornecida");
        gumballMachine.setCount(gumballMachine.getCount()-2);
        if (gumballMachine.getCount() == 0) {
            gumballMachine.setState(gumballMachine.getEsgotado());
        } else {
            gumballMachine.setState(gumballMachine.getSemCredito());
        }
    }

}
