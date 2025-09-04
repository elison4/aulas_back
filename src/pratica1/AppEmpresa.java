package pratica1;

public class AppEmpresa {
    public static void main(String[]args){
        Funcionariohj f1 = new FuncionarioClt("Jonas", 3000);
        Funcionariohj f2 = new FuncionarioPJ("Rita", 4000);

        System.out.println("Funcionario CLT" );
        f1.exibirDados();

        System.out.println("Calcular salario final"+ f1.calcularSalarioFinal());
        ;

        System.out.println("Funcionario PJ");
        f2.exibirDados();

        System.out.println("Calcular salario final" + f2.calcularSalarioFinal());
        ;
    }
}
