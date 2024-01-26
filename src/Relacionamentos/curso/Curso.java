package Relacionamentos.curso;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    String nome;
    List<Aluno> alunos = new ArrayList<>();

    public Curso(){

    }

    public Curso(String nome){
        this.nome = nome;
    }

    void adicionarAlunos(Aluno aluno){
        aluno.cursos.add(this);
        alunos.add(aluno);
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
