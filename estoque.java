public class estoque {
    private String produto;
    private int quantidadeMinima;
    private int quantidadeAtual;

    public estoque(String produto, int quantidadeMinima, int quantidadeAtual){
        this.produto = produto;
        this.quantidadeMinima = quantidadeMinima;
        this.quantidadeAtual = quantidadeAtual;
    }
    public String getproduto(){
        return produto;
    }
    public void setproduto(String produto){
        this.produto = produto;
    }
    public int getquantidadeMinima(){
        return quantidadeMinima;
    }
    public void setquantidadeMinima(int quantidadeMinima){
        this.quantidadeMinima = quantidadeMinima;
    }
    public int getquantidadeAtual(){
        return quantidadeAtual;
    }
    public void setquantidadeAtual(int quantidadeAtual){
        this.quantidadeAtual = quantidadeAtual;
    }
    public boolean precisarepor(){
        return getquantidadeAtual() < getquantidadeMinima();
    }
    public void vendas(int totalDias, int vendapordia) {
        int dia = 1;
        while (dia <= totalDias && quantidadeAtual > 0) {
            setquantidadeAtual(getquantidadeAtual() - vendapordia);
            System.out.println("Dia " + dia + "- Estoque: " + getquantidadeAtual());
            dia++;
        }
    }
    public static void main(String[] args) {
        estoque e = new estoque("Parafuso", 20, 50);
        System.out.println("Precisa repor? " + e.precisarepor());
    }
}