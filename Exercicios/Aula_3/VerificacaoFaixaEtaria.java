package Exercicios.Aula_3;

public class VerificacaoFaixaEtaria {
    public static void main(String[] args) {
        int idade = 16; // Substitua pela idade que deseja verificar

        if (idade >= 0 && idade <= 12) {
            System.out.println("Você é uma criança.");
        } else if (idade >= 13 && idade <= 17) {
            System.out.println("Você é um adolescente.");
        } else if (idade >= 18 && idade <= 64) {
            System.out.println("Você é um adulto.");
        } else if (idade >= 65) {
            System.out.println("Você é um idoso.");
        } else {
            System.out.println("Idade inválida.");
        }
    }
}
