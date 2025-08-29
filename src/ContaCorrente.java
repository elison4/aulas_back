public class ContaCorrente {

    private String titular;
    private int numero_da_conta;
    private float saldo;
    private int limite;
    public ContaCorrente(String titular, int numero_da_conta, float saldo, int limite) {
        this.titular = titular;
        this.numero_da_conta = numero_da_conta;
        this.saldo = saldo;
        this.limite = limite;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumero_da_conta() {
        return numero_da_conta;
    }
    public void setNumero_da_conta(int numero_da_conta) {
        this.numero_da_conta = numero_da_conta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public void emitirSaldo(){
        System.out.println("Saldo atual : R$" + saldo);
    }

    public void depositar (double valor){
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ : " + valor + "realizado com sucesso");
        }
        else {
            System.out.println("Valor inválido");
        }
    }

    public void sacar (double valor) {
        if (valor > 0 && (saldo + limite) >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor +"Realizado com sucesso");

        }

        else {
            System.out.println("Saldo Insuficiente");
        }
    }

    public void mostrarInfo() {
        System.out.println("Titular" + titular);
        System.out.println("Numero da conta" + numero_da_conta);
        System.out.println("Limite" + limite);
        System.out.println("Saldo" + saldo);
    }

}



