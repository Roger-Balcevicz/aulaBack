package pratica02_2808;

public class MotorTeste {
    public static void main(String[] args) {
        Motor motor = new Motor(1000,"potente");
        Carro carro= new Carro("Gol",motor);

        carro.ligarCarro();
        carro.desligarCarro();
    }
}
