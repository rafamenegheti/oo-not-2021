package lista3.redesocial;

public class Testa {

    public static void main(String args[]){

        Usuario usr1 = new Usuario("fulano@gmail.com", "1234577");

        Usuario usr2 = new Usuario("ciclano@gmail.com", "14867546");

        RedeSocial rede1 = new RedeSocial();



    
        rede1.setCodigo(1);
        rede1.setNome("FaceBroklin");
        rede1.setUrl("www.facebroklin.com.br");
        rede1.addUsuario(usr1);
        rede1.addUsuario(usr2);
        RedeSocial rede2 = new RedeSocial(2, "Zapsbumbs", "www.zapsbumbs.com", usr2);


        //Nesse caso, toda vez que eu crio uma rede nova, ela ja tem que ser criada com um usuario,
        // mas depois eu posso adcionar mais usuarios usando o addUsuario
        
       System.out.println(rede1.toString());
       System.out.println(rede2.toString());
    }
    
}
