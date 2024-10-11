public class TarefasA18 {
    private String descricao;
    private boolean isConcluido;

    public TarefasA18(String descricao) {
        this.descricao = descricao;
        this.isConcluido = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean getIsConcluido() {
        return isConcluido;
    }

    public void setIsConcluido(boolean isConcluido) {
        this.isConcluido = isConcluido;
    }
}
