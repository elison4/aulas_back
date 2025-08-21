public class OperadorTernario {
//    public static void main(String[] args) {
//        int numero = 1056784;
//        String resultado = (numero % 2 == 0) ? "Par " : "Ímpar";
//        System.out.println("O número," + numero + "é," + resultado);
//    }


    //    public static void main(String[] args) {
//        float num1 = 2, num2 = 3;
//        byte opcao = 0;
//        switch (opcao) {
//            case 1:
//                System.out.println("Resultado da adição :" + (num1 + num2));
//                break;
//
//            case 2:
//                System.out.println("Resultado da subtração: " + (num1 - num2));
//                break;
//
//            case 3:
//                System.out.println("Resultado da multiplicação: " + (num1 * num2));
//
//            case 4:
//                if (num2 != 0) {
//                    System.out.println("Resultado da divisão: " + (num1 / num2));
//
//                } else {
//                    System.out.println("Erro: divisão por zero não é permitida!");
//                }
//                break;
//            default:
//                System.out.println("Invalido");
//        }
//    }
//
    public static void main(String[] args) {

//    for (int i = 0; i <= 5; i++){
//        System.out.println("Índice" + i);
//    }
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < 5) {
            System.out.println("Índice" + i);
            i++;
        }
        while (j < 5) {
            System.out.println("Índice" + i);
            j++;
        } while (j< 5);
        do{
            System.out.println("Índice:" +j);

        } while (k<5);// loop

    }
}