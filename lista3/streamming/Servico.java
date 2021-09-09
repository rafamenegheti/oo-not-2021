package lista3.streamming;
import java.util.ArrayList;

public class Servico {
    private int codigo;
    private String nome;
    private String url;
    private ArrayList<Filme> filme;



    public Servico() {
        this.filme = new ArrayList<Filme>();
    }

    
    

    public Servico(int codigo, String nome, String url){
        this.setCodigo(codigo);
        this.setNome(nome);
        this.setUrl(url);
        this.filme = new ArrayList<Filme>();
    }
    

    //setters
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setUrl(String url) {
        this.url = url;
    }

    public void addFilme(Filme filme){
        this.filme.add(filme);
    }

    

   //getters
    public int getCodigo() {
        return codigo;
    }
    public String getNome() {
        return nome;
    }
    public String getUrl() {
        return url;
    }
    public ArrayList<Filme> getFilme() {
        return filme;
    }

    public String toString(){
        return "codigo: " + this.codigo + " nome: " + this.nome + 
        "\n URL: " + this.url + " Filmes: " + this.filme.toString();
    }
}
