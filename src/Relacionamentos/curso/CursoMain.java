package Relacionamentos.curso;

public class CursoMain {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Jonathan");
        Aluno aluno2 = new Aluno("Cleber");
        Aluno aluno3 = new Aluno("Shiringles");

        Curso curso1 = new Curso("tecnico");
        Curso curso2 = new Curso("dev");

        curso1.adicionarAlunos(aluno1);
        curso1.adicionarAlunos(aluno2);
        curso2.adicionarAlunos(aluno1);

        for(Aluno curso: curso1.alunos){
            System.out.println(curso.nome);
        }

        System.out.println(aluno1.cursos);
    }
}
