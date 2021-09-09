package lista3.redesocial;

public class Usuario {

    private String login;
    private String senha;

    public Usuario() {
    }

    public Usuario(String login, String senha) {
        this.setLogin(login);
        this.setSenha(senha);
    }

    // setters

    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    // getters

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public String toString(){
    return "\n Login: " + this.login + " Senha: " + this.senha;
    }

}