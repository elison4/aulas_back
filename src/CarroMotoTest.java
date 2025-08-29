public class CarroMotoTest {
    public static void main(String[] args){
        Carro carro = new Carro("Picape", 2004, 4);
        Moto moto = new Moto(" Honda", 2011);
        moto.empinar();
        carro.abrirPortas();
    }
}
