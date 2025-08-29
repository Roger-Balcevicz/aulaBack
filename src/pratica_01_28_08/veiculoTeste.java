package pratica_01_28_08;

public class veiculoTeste {
    public static void main(String[] args) {
        carro carro = new carro("Gol", 1991,2);
        carro.ligar();
        carro.abrirPortas();

        moto moto = new moto("CG", 2007);
        moto.ligar();
        moto.empinar();

    }
}
