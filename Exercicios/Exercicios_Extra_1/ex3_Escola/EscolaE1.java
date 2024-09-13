import java.util.ArrayList;

public class EscolaE1 {
    private String nome;
    private String endereco;
    private ArrayList<CursoE1> cursos;

    public EscolaE1(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.cursos = new ArrayList<>();
    }

    public void adicionarCurso(CursoE1 curso) {
        cursos.add(curso);
    }

    public void removerCurso(String nomeCurso) {
        cursos.removeIf(curso -> curso.getNome().equals(nomeCurso));
    }

    public void listarCursos() {
        for (CursoE1 curso : cursos) {
            System.out.println(curso.getNome());
        }
    }
}

