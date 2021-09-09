package lista1;


public class Cliente {

    int numeroConta;
    int numeroAgencia;
    String nome;
    float saldo;

    public Cliente() {

    }

    public Cliente(int numeroConta, int numeroAgencia, String nome, float saldo) {

        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nome = nome;
        this.saldo = saldo;

    }

    public void deposito(float x) {
        this.saldo = this.saldo + x;
    }

    public void saque(float x) {
        if ((this.saldo - x) > 0) {
            this.saldo -= x;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void dadosCliente() {
        System.out.println("Numero: " + this.numeroAgencia + " Cliente: " + this.nome + " Saldo: " + this.saldo);
    }

}
