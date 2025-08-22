import java.util.Scanner;
public class VetorOrdenadoTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        VetorOrdenado vo = new VetorOrdenado(20);

        // Teste 1: inserção
        vo.insere(50);
        vo.insere(20);
        vo.insere(40);
        vo.insere(2);
        vo.insere(60);

        System.out.println("Teste 1 - Inserção e exibição:");
        vo.exibe();

        // Teste 2: busca de elementos
        System.out.println("\nTeste 2 - Busca:");
        int[] valoresBusca = {50,2, 40,60};

        for (int valor : valoresBusca) {
            int pos = vo.busca(valor);
            if (pos >= 0) {
                System.out.println("Valor " + valor + " encontrado na posição " + pos);
            } else {
                System.out.println("Valor " + valor + " não encontrado.");
            }
        }

        // Teste 3: inserindo mais elementos
        vo.insere(50);
        vo.insere(20);
        vo.insere(10);

        System.out.println("\nTeste 3 - Após novas inserções:");
        vo.exibe();

        sc.close();
    }
}


