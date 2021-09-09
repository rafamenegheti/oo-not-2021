package lista1;


public class testaCliente {

    public static void main(String args[]) {

        Cliente obj1 = new Cliente();
        obj1.numeroAgencia = 46887;
        obj1.numeroConta = 41567;
        obj1.nome = "Rogisvaldo";
        
       Cliente obj2 = new Cliente(168867, 752747, "Gege", 0);

       obj1.deposito(80);
       obj1.saque(40);
       obj1.dadosCliente();


       obj2.deposito(574);
       obj2.saque(457);
       obj2.dadosCliente();

    }

}



