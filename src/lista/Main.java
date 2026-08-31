package lista;

public class Main{
    public static void main(String[]arg){
        Carro c1 =  new Carro("Ford", "Ka", 2010);
        Carro c2 =  new Carro("Chevrolet", "Onix", 2020);

        c1.acelerar();
        c2.acelerar();
    }
}