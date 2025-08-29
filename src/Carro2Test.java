public class Carro2Test {
    public static void main (String[] args){
        Motor motor = new Motor(16, "Motor45");
        Carro2 carro2 = new Carro2("Mustang", motor);
        carro2.desligarCarro();
        carro2.ligarCarro();


    }
}
