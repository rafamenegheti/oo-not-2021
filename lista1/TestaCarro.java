package lista1;


public class TestaCarro {

    // método especial chamado main que recebe como parametro um vetor de String
    // o método é publico, estático (de classe) e não retorna tipo (void)

    public static void main(String args[]) {

        Carro obj1 = new Carro();
        obj1.modelo = "Fusca";
        obj1.ano = 1995;
        obj1.motor = true;
        obj1.velocidade = 100;

        Carro obj2 = new Carro("Celta", 2016, true, 50);

        obj1.mostra();
        obj2.mostra();

    }

}
