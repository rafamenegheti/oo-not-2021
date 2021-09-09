package lista3.streamming;

public class Testa {
    public static void main(String args[]){

        Filme filme1 = new Filme(1, "Fight Club", "Drama");

        Servico serv1 = new Servico(1, "Netfrixo", "www.netfrixu.com");

        serv1.addFilme(filme1);

        System.out.print(serv1.toString());


    }
}
