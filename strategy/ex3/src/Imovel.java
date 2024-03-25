public abstract class Imovel {
    private int comodos;
    private char localizacao;
    private float espaco;
    DefinirValorComportamento valorComportamento;


    public void setValorComportamento(DefinirValorComportamento valorComportamento) {
        this.valorComportamento = valorComportamento;
    }
    
    Imovel(int comodos,char localizacao, float espaco) {
        this.comodos = comodos;
        this.localizacao = localizacao;
        this.espaco = espaco;
    }

    public float definirValor() {
        return this.valorComportamento.definirValor(this);
    }

    public int getComodos() {
        return comodos;
    }

    public char getLocalizacao() {
        return localizacao;
    }

    public float getEspaco() {
        return espaco;
    }
}
