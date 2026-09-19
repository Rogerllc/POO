package PraticaCV;
public class Caneta{
     String modelo;
     String cor;
     float ponta;
     int carga;
     boolean tampada;

    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }

    public void rabiscar(){
        if(this.tampada == true){
            System.out.println("Erro!");
        }else{
            System.out.println("Rabiscando");
        }
    }

    public void tampar(){
        if(this.tampada == true){
            System.out.println("A caneta já está tampada");
        }
    }
    public void destampar(){
       if( this.tampada == false){
            System.out.println("A caneta já está destampada");
        }
    }
}