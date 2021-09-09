package lista3.venda;

import java.util.Date;

public class Testa {
    public static void main(String args[]){

        Venda venda1 = new Venda(1, 100, new Date());
        venda1.addItemVenda(1, "Guarana Jesus", 10, 10);

        System.out.println(venda1.toString());

    }


    
}
