package lista2.emcapsulamento;

public class Aluno {

    private int numeroAluno;
    private String nome;
    private int idade;
    private float p1;
    private float p2;

    public Aluno() {

    }

    public Aluno(int numeroAluno, String nome, int idade, float p1, float p2) {
        this.setNumeroAluno(numeroAluno);
        this.setNome(nome);
        this.setIdade(idade);
        this.setNota(p1, p2);

    }

    // setters

    public final void setNumeroAluno(int numeroAluno) {
        Integer numeroAlunoger = numeroAluno;
        if ((numeroAlunoger.toString()).length() == 6) {
            this.numeroAluno = numeroAluno;
        } else {
            System.out.println("Numero do aluno deve conter 6 caracteres");
        }
    }

    public final void setNome(String nome) {
        if (nome.length() < 30) {
            this.nome = nome;
        } else {
            System.out.println("Nome não pode conter mais que 30 caracteres");
        }
    }

    public final void setIdade(int idade) {
        if (idade > 0) {
            this.idade = idade;
        } else {
            System.out.println("Idade nao pode ser menor ou igual a 0");
        }
    }

    public final void setNota(float p1, float p2) {
        if (p1 >= 0 && p2 >= 0) {
            this.p1 = p1;
            this.p2 = p2;
        } else {
            System.out.println("Nota não pode ser negativa, nenhuma nota foi gravada");
        }
    }

    // getters
    public int getNumeroAluno() {
        return this.numeroAluno;
    }

    public int getIdadeAluno() {
        return this.idade;
    }

    public String getAlunoNome() {
        return this.nome;
    }

    public float getP1() {
        return this.p1;
    }

    public float getP2() {
        return this.p2;
    }

    // Metodos

    public void notaFinal() {
        float notaFinal;
        notaFinal = (this.p1 + this.p2) / 2;
        System.out.println("Nota final: " + notaFinal);
    }

    public String toString() {
        return ("Numero Aluno: " + this.numeroAluno + " Nome: " + this.nome + " Idade: " + this.idade + " p1: "
                + this.p1 + " p2: " + this.p2);
    }

}
