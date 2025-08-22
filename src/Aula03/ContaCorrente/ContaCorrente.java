package Aula03.ContaCorrente;

public class ContaCorrente {
    private String titular;
    private int numeroConta;
    private double saldo = 50;
    private double limite = 10000;



    public ContaCorrente(String titular, int numeroConta){
        this.titular = titular;
        this.numeroConta = numeroConta;
    }


    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void mostrarInfo (){
        System.out.println("Nome do titular: " + titular);
        System.out.println("Esse é o número da conta: " + numeroConta );
        System.out.println("Esse é o saldo: " + saldo);
        System.out.println("Esse é o limite: " + limite);
    }
}
