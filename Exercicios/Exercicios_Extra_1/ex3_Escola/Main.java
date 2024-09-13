public class Main {
    public static void main(String[] args) {
        EscolaE1 escola = new EscolaE1("Escola ABC", "Rua 123, Cidade XYZ");

        ProfessorE1 professor1 = new ProfessorE1("João Silva", "123.456.789-00", "Matemática");
        CursoE1 curso1 = new CursoE1("Matemática Básica", professor1);
        escola.adicionarCurso(curso1);

        AlunoE1 aluno1 = new AlunoE1("Maria Souza", "20230001", curso1);
        curso1.adicionarAluno(aluno1);

        escola.listarCursos();
        curso1.listarAlunos();
    }
}

