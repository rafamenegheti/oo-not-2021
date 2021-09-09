package lista3.predio;

import java.util.ArrayList;

public class Predio {

    private int codigo;
    private String nome;
    private ArrayList<Apartamento> apartamento;




    public Predio() {
        this.apartamento = new ArrayList<Apartamento>();
    }

    public Predio(int codigo, String nome) {
        this.setCodigo(codigo);
        this.setNome(nome);
        this.apartamento = new ArrayList<Apartamento>();
    }
    
    public int getCodigo() {
        return codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String toString(){
        return " Codigo predio: " + this.codigo + " Nome predio: " + this.nome + 
        " Apartamentos: " + this.apartamento.toString();

    }

    public void addApartemento(int andar, int numero){
        this.apartamento.add(new Apartamento(andar, numero));
    }

    
}
