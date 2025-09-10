public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;
    public Produto(String nome, double preco, int quantidadeEmEstoque){
        this.nome = nome;
        if (preco <= 0) {
            System.out.println("Preço precisa ser maior que zero");
            System.exit(-1);
        } this.preco = preco;

        if (quantidadeEmEstoque <= 0) {
            System.out.println("Quantidade em estoque precisa ser maior que zero");
            System.exit(-1);
        } 
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void definirPreco(double preco){
        if (preco <= 0) {
            System.out.println("Preço precisa ser maior que zero");
            System.exit(-1);
        }
        this.preco += preco;
    }
    public void addItens(int itens){
        if (itens <= 0) {
            System.out.println("A quantidade de itens precisa ser maior que zero");
            System.exit(-1);
        }
        quantidadeEmEstoque += itens;
    }
    public void remItens(int itens){
        if (itens <= 0) {
            System.out.println("A quantidade de itens precisa ser maior que zero");
            System.exit(-1);
        }
        else if (itens > quantidadeEmEstoque){
            System.out.println("Quantidade de itens a remover maior que a quantidade em estoque: "+quantidadeEmEstoque);
            System.exit(-1);
        }
        quantidadeEmEstoque -= itens;
    }
    public void info(){
        System.out.println("Produto: "+ nome);
        System.out.println("Preço: "+ preco);
        System.out.println("Quantidade em estoque: "+ quantidadeEmEstoque);
    }
    public static void main(String args[]){
        Produto produto = new Produto("Camel Kretek", 11.5, 60);
        produto.addItens(20);
        produto.remItens(10);
        produto.info();
    }
}