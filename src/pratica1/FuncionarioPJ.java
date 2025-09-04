package pratica1;

public class FuncionarioPJ extends Funcionariohj {
    public FuncionarioPJ (String nome, double salarioBase){
        super(nome, salarioBase);
    }
    @Override
    public double calcularSalarioFinal(){
        return salarioBase + (salarioBase * 0.20);

    }
}
