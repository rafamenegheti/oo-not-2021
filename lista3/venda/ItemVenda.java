package lista3.venda;

public class ItemVenda {
    private int codigo;
    private String nome;
    private int qtde;
    private float valor;




    //constructors

    public ItemVenda() {
    }

    public ItemVenda(int codigo, String nome, int qtde, float valor) {
        this.setCodigo(codigo);
        this.setNome(nome);
        this.setQtde(qtde);
        this.setValor(valor);
    }

    




    //setters

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setQtde(int qtde) {
        this.qtde = qtde;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }





    //getters

    public int getCodigo() {
        return codigo;
    }
    public String getNome() {
        return nome;
    }
    public int getQtde() {
        return qtde;
    }
    public float getValor() {
        return valor;
    }


    public String toString(){
        return "\n Codigo: " + this.codigo + " Nome: " + this.nome + " valor Item: " + this.valor + 
        " Qtde: " + this.qtde;
    }





}
