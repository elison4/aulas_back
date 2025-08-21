public class Funcionario {

    String nome;
    String cargo;
    double salario;
    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }
    public Funcionario(String nome, String cargo) {
        this(nome, cargo, 2000.0);
    }

    public Funcionario(String nome) {
        this(nome, "Sem cargo", 1500.0);
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome + ", Cargo: " + cargo + ", Salário: R$" + salario);
    }

    public void aumentarSalario(double percentual) {
        salario += salario * (percentual / 100);
    }

    public void aumentarSalario(int valorFixo) {
        salario += valorFixo;
    }
}
