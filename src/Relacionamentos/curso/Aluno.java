package Relacionamentos.curso;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    String nome;
    List<Curso> cursos = new ArrayList<Curso>();

    public Aluno(){}

    public Aluno(String nome) {
        this.nome = nome;
    }

    void adicionarCurso(Curso curso){
        cursos.add(curso);
        curso.alunos.add(this);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
