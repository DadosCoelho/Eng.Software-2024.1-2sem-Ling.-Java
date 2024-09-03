package Exercicios.Aula_6.ex4_SistemaFuncionario;

public class SistemaFuncionario {
    public String nome;
    private double salario;

    public SistemaFuncionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentarSalario(double percentual){
        double vlrAlmento = (salario * percentual)/100;
        salario = salario + vlrAlmento;
        System.out.println("Com o aumento de "+percentual+"%, que é "+vlrAlmento+" reais, o novo salario é "+salario);
    }

    public void exibirDados(){
        System.out.println("Informações do Funcionario");
        System.out.println("Nome: "+nome);
        System.out.println("Salario: "+salario);
    }
    
}
