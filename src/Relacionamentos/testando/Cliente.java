package Relacionamentos.testando;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    String nome;
    int idade;
    ArrayList<Compra> compras = new ArrayList<>();

    public Cliente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}
