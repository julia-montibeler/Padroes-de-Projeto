public class Casa extends Imovel{

    Casa(int comodos, char localizacao, double espaco) {
        super(comodos, localizacao, espaco);
        setValorComportamento(new DefinirValorComEdificacao());
    }

}
