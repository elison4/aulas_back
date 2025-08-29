public class ProdutoTest {
    public static void main(String[] agrs) {
        Produto produto1 = new Produto();
        Produto produto2 = new Produto("HEADPHONE", 500);
        Produto produto3 = new Produto("Banana", 10, 50);

        produto1.exibirInfo();
        produto2.exibirInfo();
        produto3.exibirInfo();

    }
}