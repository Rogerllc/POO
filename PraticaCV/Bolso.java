package PraticaCV;

public class Bolso {
    public static void main(String[] args){
        Caneta c1 = new Caneta();
        c1.modelo = "Bic Cristal";
        c1.cor = "Preta";
        c1.ponta = 0.5f;
        c1.carga = 100;
        c1.tampar();
        c1.rabiscar();
        c1.status();
    }
}
