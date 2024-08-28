package Exercicios.Aula_4.ex1_ClassePessoa;

public class Pessoa {
    static String nome = "Reinaldo";
    static int idade = 26;
    static String cidade = "Teresina";

    public static void exibirInformacoes() {
        System.out.println("Meu nome é " + nome + ", tenho " + idade + " anos de idade e moro em " + cidade);
    }   

    public static void aniversario() {
        int novaIdade;
        novaIdade = idade + 1;
        System.out.println("Antes eu tinha " + idade + " anos de idade, mas agora tenho " + novaIdade + " anos.");
    }


}
