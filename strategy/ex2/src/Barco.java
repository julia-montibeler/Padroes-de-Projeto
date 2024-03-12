public abstract class Barco {
    int id;
    TipoMovimento tipoMovimento;

    public void setTipoMovimento(TipoMovimento tipoMovimento) {
        this.tipoMovimento = tipoMovimento;
    }

    public void mover() {
        tipoMovimento.print();
    }
}
