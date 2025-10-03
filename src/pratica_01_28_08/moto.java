package pratica_01_28_08;

public class moto extends veiculo{
    boolean temBagageiro;

    public moto(String modelo, int ano){
        super(modelo, ano);
    }
    public void empinar(){
        System.out.println("A moto "+modelo+" está empinando!");
    }
}
