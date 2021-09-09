package lista2.emcapsulamento;

public class Cliente {

    private String numeroConta;
    private String numeroAgencia;
    private float saldo;
    private String nome;

    // getters

    public Cliente() {

    }

    public Cliente(String numeroConta, String numeroAgencia, float saldo, String nome) {
        setNumeroConta(numeroConta);
        setNumeroAgencia(numeroAgencia);
        setSaldo(saldo);
        setNome(nome);

    }



    // settes

    public final void setNumeroConta(String numeroConta) {
        if ((numeroConta.length() == 8) && (numeroConta.charAt(6) == '-')) {
            this.numeroConta = numeroConta;
        } else {
            System.out.println("Numero de conta inválido");
            this.numeroConta = "Nao definido";
        }
    }

    public final void setNumeroAgencia(String numeroAgencia) {
        if ((numeroAgencia.length() == 6) && (numeroAgencia.charAt(4) == '-')) {
            this.numeroAgencia = numeroAgencia;
        } else {
            System.out.println("Numero da agencia inválido");
            this.numeroAgencia = "Nao definido";
        }
    }

    public final void setNome(String nome) {
        if (nome.length() <= 30) {
            this.nome = nome;
        } else {
            System.out.println("O nome nao pode ultrapasar 30 caracteres");
        }
    }

    public final void setSaldo(float saldo) {
        if (saldo > 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Saldo nao pode ser negativo");
        }
    }









    //Metodos

    public void sacarGrana(float valorSaque){
        if (valorSaque > 0)
        this.setSaldo(this.saldo - valorSaque);
        
    }

    public void depositarGrana(float valorDeposito){
        if (valorDeposito > 0)
        this.setSaldo(this.saldo + valorDeposito);
    }


    public void mostra() {
        System.out.println("CONTA: " + this.numeroConta + " AGENCIA: " + this.numeroAgencia + 
        " NOME: " + this.nome + " SALDO: " + this.saldo );
    }




    //getters

    public String getNumeroConta(){
        return this.numeroConta;
    }

    public String getNumeroAgencia(){
        return this.numeroAgencia;
    }

    public String getNome(){
        return this.nome;
    }

    public float getSaldo(){
        return this.saldo;
    }

    public String toString(){
        return "Numero conta: " + this.numeroConta + " Numero agencia: " + this.numeroAgencia + " Nome: " + this.nome + 
        " Saldo: " + this.saldo;
    }
}


