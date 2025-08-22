package Aula03.Conversor;

public class ConversorTest {
    public static void main(String[] args) {
        Conversor conversor = new Conversor();

        double celsius = 20;
        System.out.printf("%.2f°C para Fahrenheit: %.2f°F\n", celsius, conversor.converter(celsius));

        int horas = 2, minutos = 10;
        System.out.printf("%02d:%02d para minutos: %dmin", horas, minutos, conversor.converter(horas, minutos));
    }
}
