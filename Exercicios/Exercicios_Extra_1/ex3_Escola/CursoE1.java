import java.util.ArrayList;

public class CursoE1 {
    private String nome;
    private ProfessorE1 professor;
    private ArrayList<AlunoE1> alunos;

    public CursoE1(String nome, ProfessorE1 professor) {
        this.nome = nome;
        this.professor = professor;
        this.alunos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public ProfessorE1 getProfessor() {
        return professor;
    }

    public void adicionarAluno(AlunoE1 aluno) {
        alunos.add(aluno);
    }

    public void removerAluno(String matricula) {
        alunos.removeIf(aluno -> aluno.getMatricula().equals(matricula));
    }

    public void listarAlunos() {
        for (AlunoE1 aluno : alunos) {
            System.out.println(aluno.getNome());
        }
    }
}

