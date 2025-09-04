package pratica1;

public abstract class Funcionariohj {
    String nome;
    double salarioBase;

    public Funcionariohj(String nome, double salarioBase){
        this.nome = nome;
        this.salarioBase = salarioBase;

    }
    public void exibirDados(){
        System.out.println("Nome" + nome);
        System.out.println("Salario Base" + salarioBase);
    }

    public abstract double calcularSalarioFinal();
}
