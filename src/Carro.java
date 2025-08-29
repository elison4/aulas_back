public class Carro extends Veiculo{
   private int portas;

   public Carro(String modelo, int ano, int portas){
        super(modelo, ano);
        this.portas = portas;
    }
   public void Portas(){

       System.out.println("Portas:" + portas);
   }
   public void abrirPortas(){
       System.out.println("Abrindo " + portas + " portas do carro " +  modelo);

    }
}
