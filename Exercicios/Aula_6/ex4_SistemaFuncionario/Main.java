package Exercicios.Aula_6.ex4_SistemaFuncionario;

public class Main {
    public static void main(String[] args) {
        SistemaFuncionario Funcionario1 = new SistemaFuncionario("Reinaldo",3500);

        Funcionario1.exibirDados();
        Funcionario1.aumentarSalario(15);
        Funcionario1.exibirDados();
    }
}
