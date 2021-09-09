package lista2.emcapsulamento;

public class TestaProduto {
    public static void main(String args[]) {


        Produto prod5 = new Produto();
        prod5.setId(100);
        prod5.setDescricao("Duende");
        prod5.setQtde(5);
        prod5.setPreco(8);

        prod5.vender(7);
        prod5.descer(10);
        prod5.mostra();

      

        Produto prod6 = new Produto(54, "duende verde de brinquedo", -5, 40);

        prod6.mostra();


        System.out.println("=====================================");


        System.out.println(prod5.getQtde());
        System.out.println(prod5.getId());
        System.out.println(prod5.getPreco());
        System.out.println(prod5.getDescricao());
    }
}
