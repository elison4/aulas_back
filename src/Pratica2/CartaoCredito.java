package Pratica2;

public class CartaoCredito implements Pagamento{
    @Override
    public void  pagar() {
        System.out.println("Pagamento em Cartao de credito");
    }

    @Override
    public String getDescricao(){
        return ("Operação concluida");
    }
}
