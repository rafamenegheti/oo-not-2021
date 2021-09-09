package lista1;


public class Produto {

    int id;
    String descricao;
    int qtde;
    float preco;

    public Produto() {

    }

    public Produto(int id, String descricao, int qtde, float preco) {
        this.id = id;
        this.descricao = descricao;
        this.qtde = qtde;
        this.preco = preco;
    }

    public void comprar(int x) {
        this.qtde += x;
    }

    public void vender(int x) {
        this.qtde -= x;
    }

    public void subir(float x) {
        this.preco += x;
    }

    public void descer(float x) {
        this.preco -= x;
    }

    public void mostra() {
        System.out.println(
                ("Id: " + this.id + " descricao: " + this.descricao + " qtde: " + this.qtde + " preco " + this.preco));
    }

}
