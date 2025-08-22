public class ListaEncadeadaTest {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();

        lista.inserir(10);
        lista.inserir(20);
        lista.inserir(30);
        lista.inserir(40);

        System.out.print("Lista atual: ");
        lista.exibir();

        System.out.println("Buscar 20: " + lista.buscar(20));
        System.out.println("Buscar 50: " + lista.buscar(50));

        lista.remover(20);
        System.out.print("Lista após remover 20: ");
        lista.exibir();

        lista.remover(10);
        System.out.print("Lista após remover 10: ");
        lista.exibir();
    }

}
