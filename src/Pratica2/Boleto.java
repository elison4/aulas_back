package Pratica2;

public class Boleto implements Pagamento{
    @Override
    public void  pagar(){
        System.out.println("Pagamento em Boleto");
    }

    @Override
     public String getDescricao(){
        return   ("Valor a ser pago");
    }
}
