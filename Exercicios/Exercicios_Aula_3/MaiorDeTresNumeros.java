package Exercicios.Exercicios_Aula_3;

public class MaiorDeTresNumeros {
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 8;
        int num3 = 5;

        // Verifica qual número é o maior
        int maior = num1;
        if (num2 > maior) {
            maior = num2;
        }
        if (num3 > maior) {
            maior = num3;
        }

        System.out.println("O maior número é: " + maior);
    }
}

