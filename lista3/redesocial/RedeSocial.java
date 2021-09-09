package lista3.redesocial;

import java.util.ArrayList;


//ArrayList com agregação
public class RedeSocial {

    private int codigo;
    private String nome;
    private String url;
    // associação
    private ArrayList<Usuario> usuario; // vetor





    public RedeSocial() {
        this.usuario = new ArrayList<Usuario>();  //alocando a memoria
    }


    public RedeSocial(int codigo, String nome, String url, Usuario usuario) {
        this.codigo = codigo;
        this.nome = nome;
        this.url = url;
        this.usuario = new ArrayList<Usuario>();
        this.addUsuario(usuario);
    }





    // setters

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUsuario(ArrayList<Usuario> usuario) {
        this.usuario = usuario;
    }








    // getters

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getUrl() {
        return url;
    }

    public ArrayList<Usuario> usuario() {
        return usuario;
    }


    public String toString(){
        return "Código: " + this.codigo + " Nome: " + this.nome + " url: " + this.url + 
        " \n Usuários" + this.usuario.toString();
    }

    public void addUsuario(Usuario usuario){
        this.usuario.add(usuario);  //adciona usuario no vetor
    }
}
