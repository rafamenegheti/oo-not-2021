package lista1;


public class TestaAluno {

    public static void main(String args[]) {

        Aluno obj1 = new Aluno(); // Chama construtor aluno

        obj1.numeroAluno = 50;
        obj1.nome = "Roger";
        obj1.idade = 19;
        obj1.p1 = 7;
        obj1.p2 = 10;

        Aluno obj2 = new Aluno(54, "Junin", 19, 8, 7);

        System.out.println(obj1.notaFinal());
        System.out.println(obj2.notaFinal());
        obj1.dadosAluno();
        obj2.dadosAluno();
        System.out.println(obj1.passou());
        System.out.println(obj2.passou());

    }
}