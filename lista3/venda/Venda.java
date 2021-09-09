package lista3.venda;

import java.util.Date;
import java.util.ArrayList;

//ArrayList com composição
public class Venda {
    private int codigo;
    private float valoTotal;
    private Date data;
    // ArrayList
    private ArrayList<ItemVenda> itemVenda;

    // constructors

    public Venda() {
        this.itemVenda = new ArrayList<ItemVenda>();
    }

    public Venda(int codigo, float valoTotal, Date data) {
        this.setCodigo(codigo);
        this.setValoTotal(valoTotal);
        this.setData(data);
        this.itemVenda = new ArrayList<ItemVenda>();
    }

    // setters

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setValoTotal(float valoTotal) {
        this.valoTotal = valoTotal;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setItemVenda(ArrayList<ItemVenda> itemVenda) {
        this.itemVenda = itemVenda;
    }

    // setters

    public int getCodigo() {
        return codigo;
    }

    public float getValoTotal() {
        return valoTotal;
    }

    public Date getData() {
        return data;
    }

    public ArrayList<ItemVenda> getItemVenda() {
        return itemVenda;
    }

    //adciona o item an venda - compisção, cria o item dentro da venda, itemVenda depende da venda

    public void addItemVenda(int codigo, String nome, int qtde, float valor){
        this.itemVenda.add(new ItemVenda(codigo, nome, qtde, valor));
    }

    public String toString(){
        return "Codigo: " + this.codigo + " Valor Total: " + this.valoTotal + 
        " data: " + this.data + " Itens Venda: " + " \n " + 
        this.itemVenda.toString();
        
    }
}
