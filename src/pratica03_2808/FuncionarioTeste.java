package pratica03_2808;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario comum = new Funcionario("Pedro",2000);
        Funcionario gerente = new Gerente("Ronaldo Fenomeno", 5000);
        Funcionario vendedor = new Vendedor("Joao", 3100);

        float bonusComum = comum.calcularBonus();
        float gerenteBonus = gerente.calcularBonus();
        float vendedorBonus= vendedor.calcularBonus();

        System.out.println("O funcionario " +comum.getNome() + " está recebendo esse valor de bonus: " +bonusComum);
        System.out.println("O funcionario " +gerente.getNome() + " está recebendo esse valor de bonus: " +gerenteBonus);
        System.out.println("O funcionario " +vendedor.getNome() + " está recebendo esse valor de bonus: " +vendedorBonus);
    }
}
