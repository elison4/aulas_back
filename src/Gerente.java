public class Gerente extends FuncionarioBase {
   @Override
    public void calcularBonus (){
        System.out.println("Salário com Bonus" + salario * 0.2);
    }
}
