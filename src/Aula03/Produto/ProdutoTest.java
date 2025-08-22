package Aula03.Produto;

public class ProdutoTest {
    public static void main(String[] args) {

        Produto produto1 = new Produto();
        Produto produto2 = new Produto("Mouse", 125);
        Produto produto3 = new Produto("Teclado",350,2);

        produto1.exibirInfo();
        produto2.exibirInfo();
        produto3.exibirInfo();


    }
}
