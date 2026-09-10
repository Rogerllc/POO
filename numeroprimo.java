public class numeroprimo{
    private int numero;

    public numeroprimo(int numero){
        this.numero = numero;
    }
    public int getnumero(){
        return numero;
    }
    public void setnumero(int numero){
        this.numero = numero;
    }
    public boolean verificar(){
        if(getnumero() < 2) return false;
        for(int i = 2; i < getnumero(); i++){
            if(getnumero() % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        numeroprimo np = new numeroprimo(2);
        System.out.println(np.verificar());
    }
}