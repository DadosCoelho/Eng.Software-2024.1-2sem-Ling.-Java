import java.util.Scanner;
public class Main{
public static void main(String[] args) {
    Scanner scanf = new Scanner(System.in);
    ListaTarefasA18 lista = new ListaTarefasA18();
    int opcoes = 1;

    while (opcoes != 0) {
        System.out.println("Qual opção deseja escolher:");
        System.out.println("1. Adicionar Tarefa");
        System.out.println("2. Marcar Tarefa como Concluída");
        System.out.println("3. Exibir Todas as Tarefas");
        System.out.println("4. Excluir Tarefa");
        System.out.println("0. Sair");
        opcoes = scanf.nextInt();
        scanf.nextLine();

        switch (opcoes) {
            case 0:
                System.out.println("Até mais!!");
                break;
            case 1:
                System.out.print("Descrição da Tarefa: ");
                String descricao = scanf.nextLine();
                lista.AdicionarTarefa(descricao);
                break;
            case 2:
                System.out.print("Índice da Tarefa para Marcar como Concluída: ");
                int indexConcluir = scanf.nextInt();
                lista.MarcarTarefaConcluida(indexConcluir);
                break;
            case 3:
                lista.ExibirTarefas();
                break;
            case 4:
                System.out.print("Índice da Tarefa para Excluir: ");
                int indexExcluir = scanf.nextInt();
                lista.ExcluirTarefa(indexExcluir);
                break;
            default:
                System.out.println("Opção digitada inválida!!");
        }
    }

    scanf.close();
}
}