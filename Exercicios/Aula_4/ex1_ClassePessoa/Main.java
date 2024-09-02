package Exercicios.Aula_4.ex1_ClassePessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa Pessoa1 = new Pessoa();
        //Pessoa Pessoa2 = new Pessoa();

        Pessoa1.nome = "Reinaldo";
        Pessoa1.cidade = "Teresina-PI";
        //Pessoa1.cpf = 999;
        //Pessoa1.salario = 1000;


        //Pessoa1.subirDeCargo();
        Pessoa1.exibirInformacoes();
        Pessoa1.subirDeCargo();
        Pessoa1.exibirInformacoes();
        Pessoa1.atualizarCpf(123);
        Pessoa1.exibirInformacoes();
    }


}
