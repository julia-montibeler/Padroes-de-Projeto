public abstract class Imovel {
    private int comodos;
    private char localizacao;
    private double espaco;
    DefinirValorComportamento valorComportamento;


    public void setValorComportamento(DefinirValorComportamento valorComportamento) {
        this.valorComportamento = valorComportamento;
    }
    
    Imovel(int comodos,char localizacao, double espaco) {
        this.comodos = comodos;
        this.localizacao = localizacao;
        this.espaco = espaco;
    }
}
