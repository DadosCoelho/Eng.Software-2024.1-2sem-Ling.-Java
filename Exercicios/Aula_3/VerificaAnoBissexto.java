package Exercicios.Exercicios_Aula_3;

public class VerificaAnoBissexto {
    public static void main(String[] args) {
        int ano = 2024; // Substitua pelo ano que deseja verificar

        if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
            System.out.println(ano + " é um ano bissexto.");
        } else {
            System.out.println(ano + " não é um ano bissexto.");
        }
    }
}
