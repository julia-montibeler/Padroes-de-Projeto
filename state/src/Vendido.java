public class Vendido implements State{

    GumballMachine gumballMachine;

    Vendido(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void inserirMoeda() {
        System.out.println("Aguarde a máquina lhe oferecer uma bolinha");
    }

    @Override
    public void ejetarMoeda() {
        System.out.println("Você já acionou a alavanca");
    }

    @Override
    public void virarManivela() {
        System.out.println("Acionar a alavanca novamente não lhe dara outra bolinha");
    }

    @Override
    public void entregar() {
        System.out.println("Bolinha fornecida");
        gumballMachine.setCount(gumballMachine.getCount()-1);
        if (gumballMachine.getCount() == 0) {
            gumballMachine.setState(gumballMachine.getEsgotado());
        } else {
            gumballMachine.setState(gumballMachine.getSemCredito());
        }
    }

}
