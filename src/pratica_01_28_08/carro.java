package pratica_01_28_08;

public class carro extends veiculo {
    int portas;

    public carro(String modelo, int ano, int portas){
        super(modelo, ano);
        this.portas = portas;
    }

    public void abrirPortas(){
        System.out.println("Abrindo "+ portas +" portas do carro "+modelo);
    }
}
