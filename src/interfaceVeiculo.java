public class interfaceVeiculo {
    public void acelerar();
    public void frear();
}
public class Carro implements interfaceVeiculo{
    @Override
    public void acelerar(){
        System.out.println("Ocarro esta acelerando" );
    }

    @Override
    public void frear(){
        System.out.println("O carro está freando ");
    }
}