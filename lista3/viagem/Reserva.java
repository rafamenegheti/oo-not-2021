package lista3.viagem;
import java.util.Date;

public class Reserva {
    private int codigo;
    private Date data;
    private float valor;
    //Asociação
    private Passageiro passageiro;
    private Voo voo;

    public Reserva() {
    }








    public Reserva(int codigo, Date data, float valor, Passageiro passageiro, Voo voo) {
        this.setCodigo(codigo);
        this.setData(data);
        this.setValor(valor);
        this.setPassageiro(passageiro);
        this.setVoo(voo);
    }






    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }






    public Voo getVoo() {
        return voo;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public float getValor() {
        return valor;
    }


    public Date getData() {
        return data;
    }


    public int getCodigo() {
        return codigo;
    }


    public String toString(){
        return "Codigo: " + this.codigo + " data: " + this.data + " Valor: " + this.valor + " \n Passageiro: " + this.passageiro +
        this.passageiro.toString() + "\n Voo:" + this.voo.toString();
    }
    
}
