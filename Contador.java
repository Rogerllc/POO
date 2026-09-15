public class Contador {
    private int limite;

    public Contador(int limite){
        this.limite = limite;
    }
    public int getlimite(){
        return limite;
    }
    public void contarAte(){
        for(int i = 1; i <= getlimite(); i++){
            System.out.println(i);
        }
    }
    public static void main(String[] args){
        Contador c = new Contador(10);
        c.contarAte();
    }

}
    