package pratica1;

public class FuncionarioClt extends Funcionariohj {
    public FuncionarioClt(String nome, double salarioBase){
        super(nome, salarioBase);
    }
    @Override
    public double calcularSalarioFinal(){
        return salarioBase - (salarioBase * 0.10);
    }

}
