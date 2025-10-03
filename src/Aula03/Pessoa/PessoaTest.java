package Aula03.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa("Roger");
        Pessoa pessoa3 = new Pessoa("Roger", 21);

        pessoa1.exibir();
        pessoa2.exibir();
        pessoa3.exibir();
    }
}
