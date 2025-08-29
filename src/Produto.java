public class Produto {
    String nome;
    int quantidade;
    float preco;

    public Produto(){
        this.nome = "sem nome";
        this.preco = 0;
        this.quantidade = 0;

    }

    public Produto(String nome, float preco){
        this.nome = "HEADPHONE";
        this.preco = 500;
        this.quantidade = 0;

    }
    public Produto(String nome, float preco, int quantidade){
        this.nome = "Banana";
        this.preco = 10;
        this.quantidade = 50;

    }

    public void exibirInfo(){
        System.out.println("Nome:" + nome + "Preço:" + preco + "Quantidade:" + quantidade);
    }

}
