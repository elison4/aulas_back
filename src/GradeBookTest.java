import java.util.Scanner;

public class GradeBookTest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        GradeBook gradeBook = new GradeBook();

        System.out.println("Digite o nome do curso");
            String nome = scanner.nextLine();
            gradeBook.showMessage(nome);
    }
}
