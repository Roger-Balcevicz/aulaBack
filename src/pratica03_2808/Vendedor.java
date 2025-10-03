package pratica03_2808;

public class Vendedor extends Funcionario{
    public Vendedor(String nome, float salario) {
        super(nome, salario);
    }

    @Override
    public float calcularBonus() {
        return salario * 0.1f;
    }
}
