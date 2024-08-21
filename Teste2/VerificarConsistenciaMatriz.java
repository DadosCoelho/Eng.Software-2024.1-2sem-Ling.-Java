package Teste2;

import java.util.Scanner;

public class VerificarConsistenciaMatriz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o número de equações (linhas): ");
        int numEquacoes = scan.nextInt();

        System.out.print("Digite o número de variáveis (colunas): ");
        int numVariaveis = scan.nextInt();

        // Criando a matriz ampliada
        double[][] matriz = new double[numEquacoes][numVariaveis + 1];

        System.out.println("Digite os coeficientes e termos independentes:");

        for (int i = 0; i < numEquacoes; i++) {
            for (int j = 0; j <= numVariaveis; j++) {
                matriz[i][j] = scan.nextDouble();
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

        scan.close();
    }
}
