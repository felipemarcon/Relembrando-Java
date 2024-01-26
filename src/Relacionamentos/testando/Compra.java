package Relacionamentos.testando;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    Cliente cliente;
    List<Item> items = new ArrayList<>();

    void adicionarCliente(Cliente cliente){
        this.cliente = cliente;
        cliente.compras.add(this);
    }


    void adicionarItem(Item item){
        this.items.add(item);
    }

}
