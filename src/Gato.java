public class Gato extends Animal{
    public Gato(String nome){//Construtor da classe filha
        super(nome);
    }

    public void mostrarNome(){
        System.out.println("O nome do gato é:" + nome);
    }
}
