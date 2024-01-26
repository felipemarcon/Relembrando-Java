package Relacionamentos;

public class Item {

    Compra compra = new Compra();
    String nome;
    int quantia;
    double preco;

    public Item(String nome, int quantia, double preco) {
        this.nome = nome;
        this.quantia = quantia;
        this.preco = preco;
    }
}
