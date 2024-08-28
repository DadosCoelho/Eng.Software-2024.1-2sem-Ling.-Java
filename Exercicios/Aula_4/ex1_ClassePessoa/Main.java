package Exercicios.Aula_4.ex1_ClassePessoa;

public class Main {
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        Pessoa Pessoa1 = new Pessoa();
        Pessoa Pessoa2 = new Pessoa();

        Pessoa1.nome = "Reinaldo";
        Pessoa1.idade = 26;
        Pessoa1.cidade = "Teresina-PI";

        Pessoa1.exibirInformacoes();
    }


}
