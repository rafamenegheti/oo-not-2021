package lista1;


public class Aluno {

    int numeroAluno;
    String nome; // String é uma classe, por isso começa com letra maiuscula
    int idade;
    float p1;
    float p2;

    public Aluno() {
    }

    public Aluno(int numeroAluno, String nome, int idade, float p1, float p2) {
        this.numeroAluno = numeroAluno;
        this.nome = nome;
        this.idade = idade;
        this.p1 = p1;
        this.p2 = p2;
    }

    public float notaFinal() {
        return (this.p1 + this.p2) / 2;
    }

    public void dadosAluno() {
        System.out.println("Numero do aluno: " + this.numeroAluno + " Nome: " + this.nome);
    }

    public String passou() {

        return (this.notaFinal() >= 6) ? "aprovado" : "reprovado";
    }

}
