package Aula03.ContaCorrente;

public class ContaCorrenteTest {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente("Roger", 1234);

        contaCorrente.mostrarInfo();
        contaCorrente.getNumeroConta();
        contaCorrente.getSaldo();
        contaCorrente.getLimite();
    }
}
