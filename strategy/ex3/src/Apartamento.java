public class Apartamento extends Imovel{

    Apartamento(int comodos, char localizacao, float espaco) {
        super(comodos, localizacao, espaco);
        setValorComportamento(new DefinirValorComEdificacao());
    }

}
