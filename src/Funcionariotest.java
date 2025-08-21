public class Funcionariotest {

    public static void main(String[] args) {

        Funcionario f1 = new Funcionario("Carlos", "Analista", 3000);
        Funcionario f2 = new Funcionario("Ana", "Gerente");
        Funcionario f3 = new Funcionario("Pedro");


        f1.exibirInfo();
        f2.exibirInfo();
        f3.exibirInfo();


        f1.aumentarSalario(10);
        f2.aumentarSalario(500);
        f3.aumentarSalario(20);

        System.out.println("\nApós aumento:");
        f1.exibirInfo();
        f2.exibirInfo();
        f3.exibirInfo();
    }
}
