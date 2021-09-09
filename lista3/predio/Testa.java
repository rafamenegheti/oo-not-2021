package lista3.predio;

public class Testa {
    public static void main(String args[]) {

        Predio predio1 = new Predio(1, "O Cortiço");

        predio1.addApartemento(1, 1);

        System.out.println(predio1.toString());

    }

}
