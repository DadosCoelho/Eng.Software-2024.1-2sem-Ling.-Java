import java.util.Scanner;
public class Aula3 {
    public static void main(String[] args) throws Exception {
        /*Exercícios
            Exercício 1: Média de Três Notas
            Crie um algoritmo que receba três números e retorne a média.
            Exemplo:
            Entrada: 6, 4, 8
            Saída:  6
        */
        int nota1 = 5;
        int nota2 = 7;
        int nota3 = 9;
        int media = (nota1 + nota2 + nota3) / 3;

        System.out.println("Exercício 1- A média da nota " + nota1 + " + " + nota2 + " + " + nota3 + " é: " + media);

        /*Exercícios
            Exercício 2: Fatorial de um Número
            Implemente um algoritmo que calcule o fatorial de um número n. O 
            fatorial de n é o produto de todos os números inteiros positivos menores 
            ou iguais a n.
            Exemplo:
            Entrada: 5
            Saída: 120 (pois 5! = 5 × 4 × 3 × 2 × 1)
        */
        int numero2 = 5;
        long fatorial = 1;
        for (int i = 1; i <= numero2; i++) {
            fatorial *= i;
        }
        
        System.out.println("Exercício 2- O fatorial de " + numero2 + " é " + fatorial);

        /*Exercícios
            Exercício 3: Verificação de Paridade
            Escreva um programa que receba um número inteiro e informe se ele é 
            par ou ímpar.
            Exemplo:
            Entrada: 6
            Saída: Par
        */
        Scanner scanf = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero3 = scanf.nextInt();
        scanf.close();
        //int numero3 = 6;
        
        if (numero3 % 2 == 0) {
            System.out.println("Exercício 3- O numero " + numero3 + " é Par");
        } else {
            System.out.println("Exercício 3- O numero " + numero3 + " é Ímpar");
        }
        /*Exercícios
        Exercício 4: Números Primos
        Desenvolva um algoritmo para verificar se um número n é primo. Um 
        número primo é um número maior que 1 que tem apenas dois divisores: 
        1 e ele mesmo.
        Exemplo:
        Entrada: 7
        Saída: Primo
        */

        int numero4 = 7;

        if (numero4 <= 1) {
            System.out.println("Não é primo");
        } else {
            boolean isPrimo = true;
            for (int i = 2; i <= Math.sqrt(numero4); i++) {
                if (numero4 % i == 0) {
                    isPrimo = false;
                    break;
                }
            }
            if (isPrimo) {
                System.out.println("Exercício 4- O numero " + numero4 + " é Primo");
            } else {
                System.out.println("Exercício 4- O numero " + numero4 + " Não é primo");
            }
        }

    }
}

