package pratica03_2808;

public class Gerente extends Funcionario{
    public Gerente(String nome,float salario) {
        super(nome,salario);

    }
    @Override
    public float calcularBonus() {
        return salario * 0.2f;
    }
}
