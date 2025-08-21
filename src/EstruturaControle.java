public class EstruturaControle {
    public static void main(String[] args) {
        int numeroFaltas = 2;
        int media = 6;

        if (media >= 6) {
            System.out.println("Aprovado");
        }

        if (media >= 6 && numeroFaltas <= 20) {
            System.out.println("Aprovado");
        } else {
            System.out.println( "Reprovado");
        }

        if (media < 6 || numeroFaltas > 20) {
            System.out.println("Reprovado");
        } else {
            System.out.println("Aprovado");
        }

    }
}

