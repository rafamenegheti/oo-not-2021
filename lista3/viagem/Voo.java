package lista3.viagem;

import java.util.Date;


public class Voo{

    private int numero;
    private String origem;
    private String destino;
    private Date data;


    public Voo() {
    }



    public Voo(int numero, String origem, String destino, Date data) {
        this.setNumero(numero);
        this.setOrigem(origem);
        this.setDestino(destino);
        this.setData(data);
    }





    //setters

    public void setData(Date data) {
        this.data = data;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }






    //getters

    public Date getData() {
        return data;
    }

    public String getDestino() {
        return destino;
    }

    public String getOrigem() {
        return origem;
    }

    public int getNumero() {
        return numero;
    }

    public String toString(){
        return "Numero: " + this.numero + " origem: " + this.origem + " destino: " + this.destino + " data: " + this.data;
    }

}
