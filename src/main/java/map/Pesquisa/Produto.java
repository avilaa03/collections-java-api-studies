package main.java.map.Pesquisa;

public class Produto {

    private String nome;
    private int quantidade;
    private double preco;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

}
