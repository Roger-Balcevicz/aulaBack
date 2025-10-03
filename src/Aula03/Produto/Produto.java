package Aula03.Produto;

public class Produto {
    String nome = "Roger";
    int preco = 32;
    int quantidade = 2;

    public Produto() {
        this.nome = "Sem nome";
    }

    public Produto(String nome, int preco) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = 0;
    }

    public Produto(String nome, int preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome +" ,Preco: " + preco +" ,Quantidade: " + quantidade);
    }
}
