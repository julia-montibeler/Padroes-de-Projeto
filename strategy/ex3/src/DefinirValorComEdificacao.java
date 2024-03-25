public class DefinirValorComEdificacao implements DefinirValorComportamento{

    @Override
    public float definirValor(Imovel i) {
        if (i.getLocalizacao() == 'A'){
            return i.getEspaco()*3000 + (1000*i.getComodos());
        }
        else if (i.getLocalizacao() == 'B'){
            return i.getEspaco()*1000 + (1000*i.getComodos());
        }
        else if (i.getLocalizacao() == 'C'){
            return i.getEspaco()*500 + (1000*i.getComodos());
        }

        return 0;
    }
}
