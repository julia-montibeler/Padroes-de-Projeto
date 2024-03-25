public class Terreno extends Imovel{

    Terreno(int comodos, char localizacao, float espaco) {

        super(comodos, localizacao, espaco);
        setValorComportamento(new DefinirValorSemEdificacao());

    }

}
