public class Carro2 {
    private String modelo;
    protected Motor motor;

    public Carro2(String modelo, Motor motor ){
        this.modelo =  modelo;
        this.motor = motor;
    }

    public void ligarCarro () {
        this.motor.ligar();
        System.out.println("Carro " + modelo + " está em movimento...");
    }
    public void desligarCarro (){
        this.motor.desligar();
        System.out.println("Carro " + modelo + " Está parado");

    }



}
