package lista1;


public class Carro {

    // Dois tipos de variaveis
    // Tipo primitivo - int, float, double, char
    // Tipo classe - string, Float, Double, Integer

    // propiedades (variáveis) da classe
    float velocidade; // Numero com ponto flutuantes
    boolean motor; // booleano, true e false
    int ano; // numero inteiro
    String modelo; // String é uma classe pronta - cj de caracteres

    // Método construtor
    public Carro() {

    }

    // Metodo construtor
    public Carro(String modelo, int ano, boolean motor, float velocidade) {
        // variavel do objeto = variavel do usuário
        this.modelo = modelo;
        this.ano = ano;
        this.motor = motor;
        this.velocidade = velocidade;
    }

    // Um metodo ou operação
    public void mostra() {
        // this representa o obj em questão
        System.out.println("modelo " + this.modelo + " ano: " + this.ano + " vel: " + this.velocidade);

    }

}