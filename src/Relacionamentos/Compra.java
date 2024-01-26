package Relacionamentos;

import java.util.ArrayList;

public class Compra {

    String cliente;
    ArrayList<Item> itens = new ArrayList<Item>();

    void adicionarItem(Item item){
        this.itens.add(item);
        item.compra = this;
    }

    void adicionarItem(String nome, int quantia, double preco){
        this.adicionarItem(new Item(nome, quantia, preco));
    }


    double valorTotal(){
        double total = 0;
        for(Item item: itens){
            total += item.quantia * item.preco;
        }
        return total;
    }




}
