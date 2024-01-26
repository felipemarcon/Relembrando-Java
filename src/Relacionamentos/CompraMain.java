package Relacionamentos;

public class CompraMain {
    public static void main(String[] args) {
        Compra c = new Compra();
        c.cliente = "clauda";
        c.adicionarItem("banana", 3, 10);
        c.adicionarItem("maça", 1, 5);
        c.adicionarItem("melão", 2, 5);

        System.out.println(c.valorTotal());

    }
}
