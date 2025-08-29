public class Veiculo {
    protected String modelo;
    protected int ano;

    public Veiculo (String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }
    public void veiculoLigado(){
            System.out.println( "O veículo " + modelo + "está ligado.");
    }

}
