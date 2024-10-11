import java.util.ArrayList;

public class ListaTarefasA18 {
    private ArrayList<TarefasA18> tarefas = new ArrayList<>();

    public ListaTarefasA18() {
    }

    public void AdicionarTarefa(String descricao) {
        TarefasA18 novaTarefa = new TarefasA18(descricao);
        this.tarefas.add(novaTarefa);
    }

    public void MarcarTarefaConcluida(int index) {
        if (index >= 0 && index < tarefas.size()) {
            tarefas.get(index).setIsConcluido(true);
        }
    }

    public void ExibirTarefas() {
        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println(i + ": " + tarefas.get(i).getDescricao() + " - " + (tarefas.get(i).getIsConcluido() ? "Concluída" : "Pendente"));
        }
    }

    public void ExcluirTarefa(int index) {
        if (index >= 0 && index < tarefas.size()) {
            tarefas.remove(index);
        }
    }
}
        