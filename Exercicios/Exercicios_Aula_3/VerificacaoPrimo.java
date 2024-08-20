package Exercicios.Exercicios_Aula_3;

public class VerificacaoPrimo {
    public static void main(String[] args) {
        int numero = 7; // Suponha que queremos verificar o número 7

        if (ehPrimo(numero)) {
            System.out.println("O número é primo.");
        } else {
            System.out.println("O número não é primo.");
        }
    }

    // Função para verificar se um número é primo
    private static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false; // Números menores ou iguais a 1 não são primos
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; // Se for divisível por algum número, não é primo
            }
        }

        return true; // Se não foi divisível por nenhum número, é primo
    }
}
