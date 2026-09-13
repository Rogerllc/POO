public class Aluno {
    private double nota1;
    private double nota2;
    private double freq;

    public Aluno(double nota1, double nota2, double freq){
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.freq = freq;
    }
    public double getnota1(){ return nota1;}
    public void setnota1(double nota1){ this.nota1 = nota1;}
    public double getnota2(){ return nota2;}
    public void setnota2(double nota2){ this.nota2 = nota2;}
    public double getfreq(){ return freq;}
    public void setfreq(double freq){ this.freq = freq;}

    public void situacao(){
        double media = (getnota1() + getnota2()) / 2;
        boolean aprovado = (media >= 6.0);
        boolean compriu = (getfreq() >= 75.00);

        if(aprovado && compriu){
            System.out.println("Aprovado");
        } else if(!aprovado && compriu){
            System.out.println("Reprovado por nota");
        } else if(aprovado){
            System.out.println("Reprovado por frequencia");
        }else{
            System.out.println("Reprovado por nota e frequencia");
        }
    }
    public static void main(String[] args){
        Aluno aluno = new Aluno(6.0, 8.0, 80);
        aluno.situacao();
    }
}
