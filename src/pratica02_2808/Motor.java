package pratica02_2808;

public class Motor {
    private int potencia;
    private String tipo;

    public Motor (int potencia, String tipo) {
        this.potencia = potencia;
        this.tipo = tipo;
    }

    public void ligar (){
        System.out.println("Motor está ligado");
    }
    public void desligar() {
        System.out.println("Motor está desligado");
    }
}
