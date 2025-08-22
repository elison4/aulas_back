public class VetorOrdenado {
    private int[] vetor;
    private int nElementos;

    public VetorOrdenado(int capacidade) {
        vetor = new int[capacidade];
        nElementos = 0;
    }

    // Insere mantendo a ordem
    public void insere(int valor) {
        int i;
        if (nElementos == 0) {
            vetor[0] = valor;
            nElementos++;
            return;
        }

        for (i = nElementos - 1; i >= 0; i--) {
            if (valor < vetor[i]) {
                vetor[i + 1] = vetor[i];
            } else {
                break;
            }
        }
        vetor[i + 1] = valor;
        nElementos++;
    }

    // Mostra os elementos
    public void exibe() {
        for (int i = 0; i < nElementos; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }

    // Busca binária
    public int busca(int valor) {
        int inicio = 0, fim = nElementos - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            if (vetor[meio] == valor) {
                return meio;
            } else if (vetor[meio] < valor) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return -1;
    }


}
