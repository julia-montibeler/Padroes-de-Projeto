public class DefinirValorSemEdificacao implements DefinirValorComportamento{
    @Override
    public float definirValor(Imovel i) {
        if (i.getLocalizacao() == 'A'){
            return i.getEspaco()*1500;
        }
        else if (i.getLocalizacao() == 'B'){
            return i.getEspaco()*750;
        }
        else if (i.getLocalizacao() == 'C'){
            return i.getEspaco()*200;
        }

        return 0;
    }
}
