package lista1;


public class TestaProduto {
    public static void main(String args[]) {

        Produto obj1 = new Produto();
        obj1.descricao = "Produto bom";
        obj1.id = 45;
        obj1.qtde = 10;
        obj1.preco = 10.5f;

        obj1.comprar(6);
        obj1.vender(3);
        obj1.subir(5);
        obj1.descer(3.4f);
        obj1.mostra();

    }
}
