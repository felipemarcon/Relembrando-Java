package Relacionamentos.testando;

public class TestandoMain {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Jonathan", 14);
        Produto produto1 = new Produto("banana");
        Produto produto2 = new Produto("chocolate");
        Item item1 = new Item(produto1, 2, 13);
        Item item2 = new Item(produto2, 2, 13);
        Compra c1 = new Compra();
        Compra c2 = new Compra();
        c1.adicionarCliente(cliente1);
        c1.adicionarItem(item1);
        c1.adicionarItem(item2);

        c2.adicionarCliente(cliente1);
        c2.adicionarItem(item2);

        System.out.println(cliente1.compras.get(0).items.get(0).produto.nome);



    }
}
