public class Casa extends Imovel{

    Casa(int comodos, char localizacao, float espaco) {
        super(comodos, localizacao, espaco);
        setValorComportamento(new DefinirValorComEdificacao());
    }

}
