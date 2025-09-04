package Pratica2;

public class Pix implements Pagamento{
    @Override
    public void  pagar(){
        System.out.println("Pagamento em Pix");
    }

    @Override
    public String getDescricao(){
        return ("Operação concluida");
    }
}
