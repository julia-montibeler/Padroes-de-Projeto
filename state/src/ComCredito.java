import java.util.Random;

public class ComCredito implements State{

    GumballMachine gumballMachine;
    Random gerador = new Random();

    ComCredito(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void inserirMoeda() {
        System.out.println("Você não pode inserir outra moeda");

    }

    @Override
    public void ejetarMoeda() {
        System.out.println("Moeda devolvida");
    }

    @Override
    public void virarManivela() {
        if (gerador.nextInt(10)==1) {
            gumballMachine.setState(gumballMachine.getVencedor());
            System.out.println("Você foi sorteado!");
        } else {
            gumballMachine.setState(gumballMachine.getVendido());
            System.out.println("Bolinha vendida");
        }

    }

    @Override
    public void entregar() {
        System.out.println("Nenhuma bolinha foi entregue");
    }

}
