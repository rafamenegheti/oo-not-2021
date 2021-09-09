package lista1;


public class Rio {
    public float nivel;
    public boolean poluido;

    public Rio() {

    }

    public Rio(float nivel, boolean poluido) {
        this.nivel = nivel;
        this.poluido = poluido;
    }

    public void chover(float x) {
        this.nivel += x;
    }

    public void ensolarar(float x) {
        this.nivel -= x;
    }

    public void limpar() {
        this.poluido = false;
    }

    public void sujar() {
        this.poluido = true;
    }

    public String mostra() {
        String auxiliar = this.poluido ? "Esta poluido" : "Nao esta poluido";
        return auxiliar;

    }

}
