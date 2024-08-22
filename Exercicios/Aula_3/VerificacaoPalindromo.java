package Exercicios.Aula_3;

public class VerificacaoPalindromo {
    public static void main(String[] args) {
        String palavra = "radar"; // Substitua pela sua string de teste

        if (ehPalindromo(palavra)) {
            System.out.println("É um palíndromo!");
        } else {
            System.out.println("Não é um palíndromo!");
        }
    }

    // Função para verificar se uma string é um palíndromo
    private static boolean ehPalindromo(String palavra) {
        palavra = palavra.toLowerCase().replaceAll("[^a-z]", ""); // Remove espaços e converte para minúsculas
        int i = 0;
        int j = palavra.length() - 1;

        while (i < j) {
            if (palavra.charAt(i) != palavra.charAt(j)) {
                return false; // Caracteres diferentes, não é palíndromo
            }
            i++;
            j--;
        }

        return true; // Todos os caracteres coincidem, é palíndromo
    }
}
