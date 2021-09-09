package lista3.ecomerce;

public class itemCarrinho {

    private int codigo;
    private float valor;
    private int qtde;



    public itemCarrinho() {
    }
    

    public itemCarrinho(int codigo, float valor, int qtde) {
        this.setCodigo(codigo);
        this.setValor(valor);
        this.setQtde(qtde);
    }




    //Setters

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }


    public void setValor(float valor) {
        this.valor = valor;
    }


    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }





    //Getters

    public int getQtde() {
        return qtde;
    }


    public float getValor() {
        return valor;
    }


    public int getCodigo() {
        return codigo;
    }


    public String toString(){
        return "qtde: " + this.qtde + " valor: " + this.valor + " codigo: " + this.codigo;
    }



    
}



