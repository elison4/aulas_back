public class Livro {
    String titulo;
    String autor;
    int ano;


    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }
    public void exibirInfo() {
        System.out.println("Título: " + titulo + ", Autor: " + autor + ", Ano: " + ano);
    }
}

