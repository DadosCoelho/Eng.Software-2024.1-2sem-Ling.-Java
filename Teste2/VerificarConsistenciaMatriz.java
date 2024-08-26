package Teste2;

import java.util.Scanner;

public class VerificarConsistenciaMatriz {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o número de equações (linhas): ");
            int numEquacoes = scanner.nextInt();
            
            System.out.print("Digite o número de variáveis (colunas): ");
            int numVariaveis = scanner.nextInt();
            
            // Criando a matriz ampliada
            double[][] matriz = new double[numEquacoes][numVariaveis + 1];
            
            System.out.println("Digite os coeficientes e termos independentes:");
            
            for (int i = 0; i < numEquacoes; i++) {
                for (int j = 0; j <= numVariaveis; j++) {
                    matriz[i][j] = scanner.nextDouble();
                }
            }
            
            // Verificando consistência
            boolean consistente = true;
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
                    break;
                }
            }
            
            if (consistente) {
                System.out.println("O sistema é consistente.");
            } else {
                System.out.println("O sistema é inconsistente.");
            }
        }
    }
}
