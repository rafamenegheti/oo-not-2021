package lista3.predio;

public class Apartamento {

    private int andar;
    private int numero;
   


    public Apartamento() {
    }

    public Apartamento(int andar, int numero) {
        this.setAndar(andar);
        this.setNumero(numero);
    }
   


    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setAndar(int andar) {
        this.andar = andar;
    }
    

    public int getAndar() {
        return andar;
    }
    public int getNumero() {
        return numero;
    }

    public String toString(){
        return "\n numero: " + this.numero + " andar: " + this.andar;
    }
    
    
}
