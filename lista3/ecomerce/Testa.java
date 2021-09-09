package lista3.ecomerce;
import java.util.Date;

public class Testa {
    

    public static void main(String args[]) {

// item do carrinho nesse caso é criado ja dentro do carrinho, e nao de forma independente
// asociação de composição
    Carrinho ca1 = new Carrinho(10, 1000, "Cartão de credito", new Date(), 11, 59.7f, 8);


    System.out.println(ca1.toString());

    }

}
