package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinho;

    public CarrinhoDeCompras(List<Item> carrinho) {
        this.carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        carrinho.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        for (Item item : carrinho) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                itensParaRemover.add(item);
            }
        }
        carrinho.removeAll(itensParaRemover);
    }

    public double calcularValorTotal() {
        double valorTotal = 0;
        for (Item item : carrinho) {
            valorTotal = valorTotal + (item.getValor() * item.getQuantidade());
        }
        return valorTotal;
    }

    public void exibirItens() {
        System.out.println(carrinho);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras(new ArrayList<>());

        System.out.println("Valor total do Carrinho: " + carrinho.calcularValorTotal());

        carrinho.adicionarItem("Suco", 12.50, 2);
        carrinho.adicionarItem("Chocolate", 7, 2);
        carrinho.adicionarItem("Batata", 5, 1);
        System.out.println("Valor total do Carrinho: " + carrinho.calcularValorTotal());

        carrinho.removerItem("Chocolate");
        System.out.println("Valor total do Carrinho: " + carrinho.calcularValorTotal());

        carrinho.exibirItens();
    }
}
