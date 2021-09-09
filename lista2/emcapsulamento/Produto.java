package lista2.emcapsulamento;

public class Produto {
    // Vamos encapsular as variaves, -> esconder/proteger, deixando 'private'
    private int id;
    private String descricao;
    private int qtde;
    private float preco;

    public Produto() {

    }

    public Produto(int id, String descricao, int qtde, float preco) {
        this.setId(id);
        this.setDescricao(descricao);
        this.setQtde(qtde);
        this.setPreco(preco);
    }

    // Vamos criar os metodos setters
    //Metodo final nao pode ser alterado nas classes filhas

    public final void setQtde(int qtde) {
        if (qtde >= 0) {
            this.qtde = qtde;
        } else {
            System.out.println("Qtde nao pode ser menor ou igual a 0");
        }
    }

    public final void setDescricao(String descricao) {
        if (descricao.length() < 500) {
            this.descricao = descricao;
        } else {
            System.out.println("Descricao no pode conter mais de 500 caracteres");
        }
    }

    public final void setPreco(float preco) {
        if (preco > 0) {
            this.preco = preco;
        } else {
            System.out.println("Preço nao pode ser menos ou igual a 0");
        }
    }

    public final void setId(int id) {
        if (id <= 0) {
            System.out.println("id nao pode ser menos que 0");
        } else {
            this.id = id;
        }

    }






    //Getters

    public int getQtde(){
        return this.qtde;
    }

    public int getId(){
        return this.id;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public Float getPreco(){
        return this.preco;
    }










    // Funções

    public void comprar(int x) {

        this.setQtde(this.qtde + x);
    }

    public void vender(int x) {
        this.setQtde(this.qtde - x);
    }

    public void subir(float x) {
        setPreco(this.preco + x);
    }

    public void descer(float x) {
        if (x < 0){
            System.out.println("O valor de descer nao pode ser menos que 0");
        }
        else{
        setPreco(this.preco - x);
        }
    }

    public void mostra() {
        System.out.println(
                ("Id: " + this.id + " descricao: " + this.descricao + " qtde: " + this.qtde + " preco " + this.preco));
    }

}
