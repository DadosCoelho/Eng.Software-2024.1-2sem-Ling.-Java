public class AlunoE1 {
    private String nome;
    private String matricula;
    private CursoE1 curso;

    public AlunoE1(String nome, String matricula, CursoE1 curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public CursoE1 getCurso() {
        return curso;
    }
}

