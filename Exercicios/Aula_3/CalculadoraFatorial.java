package Exercicios.Exercicios_Aula_3;


public class CalculadoraFatorial {
    public static void main(String[] args) {
        // Suponha que queremos calcular o fatorial de 5
        int numero = 5;
        long fatorial = 1; // Inicializamos o fatorial com 1

        // Calcula o fatorial
        for (int i = 1; i <= numero; i++) {
            fatorial *= i; // Multiplica o fatorial pelo próximo número
        }

        // Exibe o resultado
        System.out.println("O fatorial de " + numero + " é: " + fatorial);
    }
}
