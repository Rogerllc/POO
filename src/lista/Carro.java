package lista;

// A palavra "package" é usada para organizar classes em pacotes. Aqui, a classe "Carro" está sendo colocada no pacote "lista".
public class Carro { // A palavra "public" é um modificador de acesso que permite que a classe seja acessada de qualquer outro lugar do programa. A palavra "class" é usada para declarar uma classe em Java. O nome da classe é "Carro".
    public String modelo;
    public String cor;
    public int ano;

    public Carro(String modelo, String cor, int ano) {
        this.modelo = modelo; // A palavra "this" é usada para se referir ao objeto atual da classe. Aqui, ela é usada para diferenciar entre o parâmetro "modelo" e o atributo "modelo" da classe.
        this.cor = cor;
        this.ano = ano;
    }

    public void acelerar() {
        System.out.println("O Carro " + modelo + " está acelerando.");
    }
}