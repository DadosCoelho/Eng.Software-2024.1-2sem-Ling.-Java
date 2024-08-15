public class VerificarConsistenciaMatriz {
    public static void main(String[] args) {
        // Defina manualmente a matriz ampliada (exemplo)
        double[][] matriz = {
            {2, 1, 5, 10},
            {1, 3, 2, 8},
            {3, 2, 4, 12}
        };

        int numEquacoes = matriz.length;
        int numVariaveis = matriz[0].length - 1;

        // Verificando consistência
        if (numVariaveis > numEquacoes) {
            System.out.println("O sistema é inconsistente.");
        } else {
            System.out.println("O sistema é consistente.");
        }
    }
}