package Exercicios.Aula_6.ex4_SistemaFuncionario;

public class SistemaFuncionario {
    public String nome;
    private double salario;

    public SistemaFuncionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public void aumentarSalario(double percentual){
        double vlrAlmento = (getSalario() * percentual)/100;
        //salario = salario + vlrAlmento;
        setSalario(getSalario() + vlrAlmento);
        System.out.println("Com o aumento de "+percentual+"%, que é "+vlrAlmento+" reais, o novo salario é "+getSalario());
    }

    public void exibirDados(){
        System.out.println("Informações do Funcionario");
        System.out.println("Nome: "+getNome());
        System.out.println("Salario: "+getSalario());
    }
    
}
