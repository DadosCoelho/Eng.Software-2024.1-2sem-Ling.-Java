public class App {
    public static void main(String[] args) throws Exception {
        // Defina manualmente a matriz ampliada (exemplo)
        double[][] matriz = {
            {2, 1, 5, 10},
            {0, 0, 0, 8},
            {1, 0, 0, 12}
        };

        int numEquacoes = matriz.length;
        int numVariaveis = matriz[0].length - 1;

        boolean consistente = true;
        int linhaInconsistente = -1; // Inicializa com um valor inválido

        for (int i = 0; i < numEquacoes; i++) {
            boolean todosZeros = true;
            for (int j = 0; j < numVariaveis; j++) {
                if (matriz[i][j] != 0) {
                    todosZeros = false;
                    break;
                }
            }
            if (todosZeros && matriz[i][numVariaveis] != 0) {
                consistente = false;
                linhaInconsistente = i;
                break;
            }
        }

        if (consistente) {
            System.out.println("O sistema é consistente.");
        } else {
            System.out.println("O sistema é inconsistente. A linha " + (linhaInconsistente + 1) + " é inconsistente.");
        }
    }
    
}
