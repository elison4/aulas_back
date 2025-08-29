public class ConversorTest {
    public static void main(String[] args){
        Conversor conversor = new Conversor();

        double fahrenheit = conversor.converter(25.0);
        System.out.println("25º em Fahrenheit " + fahrenheit + " ºF");

        int totalMinutos = conversor.converter(2,30);
        System.out.println("2 horas e 30 minutos em minutos: " + totalMinutos + " minutos ");
    }
}
