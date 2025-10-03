package pratica03_2808;

public class Funcionario {
    protected String nome;
    protected float salario;

    public Funcionario(String nome,float salario) {
        this.salario = salario;
        this.nome = nome;
    }
    public float calcularBonus(){
      return salario * 0.05f;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}

