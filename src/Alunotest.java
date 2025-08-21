public class Alunotest {
    public static void main(String[] args) {

        Aluno a1 = new Aluno();
        a1.nome = "João";
        a1.idade = 20;

        Aluno a2 = new Aluno();
        a2.nome = "Maria";
        a2.idade = 22;


        a1.exibirDados();
        a2.exibirDados();
    }
}

