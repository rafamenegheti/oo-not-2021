package lista3.ecomerce;

import java.util.Date;

public class Carrinho {

    private int codigo;
    private float valorTotal;
    private String formaPgto;
    private Date data;
    // Associação
    private itemCarrinho itemCarrinho;

    public Carrinho() {
    }

    public Carrinho(int codigo, float valorTotal, String formaPgto, Date data, int codigoIC, float valorIC, int qtdeIC) {
        this.setCodigo(codigo);
        this.setValorTotal(valorTotal);
        this.setFormaPgto(formaPgto);
        this.setData(data);
        this.itemCarrinho = new itemCarrinho(codigoIC, valorIC, qtdeIC);
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setFormaPgto(String formaPgto) {
        this.formaPgto = formaPgto;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setItemCarrinho(int codigoIC, float valorIC, int qtdeIC){
        this.itemCarrinho = new itemCarrinho(codigoIC, valorIC, qtdeIC);
    }






    public Date getData() {
        return data;
    }

    public String getFormaPgto() {
        return formaPgto;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public int getCodigo() {
        return codigo;
    }

    public itemCarrinho getItemCarrinho(){
        return itemCarrinho;
    }







    public String toString(){
        return "Codigo: " + this.codigo + " Valor total: " + this.valorTotal + " Forma pgt: " + this.formaPgto
                + " \n Data: " + this.data + " dados do item: " + this.itemCarrinho.toString();
    }
}
