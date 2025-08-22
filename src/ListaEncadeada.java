public class ListaEncadeada {

    private No inicio;

    public ListaEncadeada() {
        this.inicio = null;
    }

    public void inserir(int valor) {
        No novo = new No(valor);
        if (inicio == null) {
            inicio = novo;
        } else {
            No temp = inicio;
            while (temp.proximo != null) {
                temp = temp.proximo;
            }
            temp.proximo = novo;
        }
    }

    public void exibir() {
        No temp = inicio;
        while (temp != null) {
            System.out.print(temp.valor + " -> ");
            temp = temp.proximo;
        }
        System.out.println("null");
    }

    public boolean buscar(int valor) {
        No temp = inicio;
        while (temp != null) {
            if (temp.valor == valor) {
                return true;
            }
            temp = temp.proximo;
        }
        return false;
    }

    public void remover(int valor) {
        if (inicio == null) return;

        if (inicio.valor == valor) {
            inicio = inicio.proximo;
            return;
        }

        No temp = inicio;
        while (temp.proximo != null && temp.proximo.valor != valor) {
            temp = temp.proximo;
        }

        if (temp.proximo != null) {
            temp.proximo = temp.proximo.proximo;
        }
    }

}
