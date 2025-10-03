package pratica02_2808;

public class Carro {
    private String modelo;
    private Motor motor;

    public Carro(String modelo, Motor motor) {
        this.modelo = modelo;
        this.motor = motor;
    }

    public void ligarCarro(){
        System.out.println("O Carro está ligado");
        motor.ligar();
    }
    public void desligarCarro(){
        System.out.println("O carro está desligado");
        motor.desligar();
    }
}

