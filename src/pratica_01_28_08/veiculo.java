package pratica_01_28_08;

public class veiculo {
    protected String modelo;
    protected int ano;

    public veiculo(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    public void ligar() {
        System.out.println("O veículo " + modelo + " Sestá ligado");
    }
}

