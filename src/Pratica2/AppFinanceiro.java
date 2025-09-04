package Pratica2;

public class AppFinanceiro {
    public static void main(String [] args){

        Pagamento pix = new Pagamento();
        Pagamento boleto = new Pagamento();
        Pagamento cartaodecredito= new Pagamento();

        pix.pagar();
        System.out.println();
        boleto.pagar();
        System.out.println();
        cartaodecredito.pagar();
        System.out.println();


    }
}
