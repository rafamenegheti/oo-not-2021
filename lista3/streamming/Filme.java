package lista3.streamming;

public class Filme {
    private int codigo;
    private String nome;
    private String classificacao;





    public Filme() {
    }


    public Filme(int codigo, String nome, String classificacao) {
        this.setCodigo(codigo);
        this.setNome(nome);
        this.setClassificacao(classificacao);

    }





    //setters
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
     
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }




    //getters
    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }
    public String getClassificacao() {
        return classificacao;
    }

    public String toString(){
        return "\n Codigo: " + this.codigo + " Nome: " + this.nome + " Classificacao: " + this.classificacao;
    }



    
    
}
