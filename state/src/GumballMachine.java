public class GumballMachine {
    State esgotado;
    State comCredito;
    State semCredito;
    State vendido;
    State vencedor;

    State state;

    int count;

    GumballMachine(int numberGumballs) {
        esgotado = new Esgotado(this);
        comCredito = new ComCredito(this);
        semCredito = new SemCredito(this);
        vendido = new Vendido(this);
        vencedor = new Vencedor(this);

        count = numberGumballs;

        if (this.count > 0) {
            state = semCredito;
        } else {
            state = esgotado;
        }
    }

    public void setState(State s) {
        this.state = s;
    }

    public State getEsgotado() {
        return this.esgotado;
    }

    public State getSemCredito() {
        return this.semCredito;
    }

    public State getComCredito() {
        return this.comCredito;
    }

    public State getVendido() {
        return this.vendido;
    }

    public State getVencedor() {
        return this.vencedor;
    }

    public int getCount() {
        return this.count;
    }

    public void setCount(int n) {
        this.count = n;
    }
}
