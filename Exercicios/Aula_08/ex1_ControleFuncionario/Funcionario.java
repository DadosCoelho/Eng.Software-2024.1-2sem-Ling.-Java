package Exercicios.Aula_08.ex1_ControleFuncionario;

public class Funcionario {
    String nome;
    String cargo;
    private double salario;

    public Funcionario(String nome, String cargo, double salario){
        this.nome = nome;
        this.cargo = cargo;
        if(salario > 0){
            this.salario = salario;
        } else {
            this.salario = 1000;
        }
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCargo(){
        return cargo;
    }

    public void setCargo(String cargo){
        this.cargo = cargo;
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public void promover(String cargo, double aumento){

        System.out.println("");
        System.out.println("Informações iniciais do funcionario");
        System.out.println("Nome:    "+nome);
        System.out.println("Cargo:   "+getCargo());
        System.out.println("Salario: "+getSalario());
        System.out.println("");

        //this.cargo = cargo;
        setCargo(cargo);

        if(aumento > 0){
            //this.salario += aumento;
            setSalario(getSalario()+aumento);
        } else {
            //this.salario += 1000;
            setSalario(getSalario()+1000);
        }

        System.out.println("Informações atuais do funcionario");
        System.out.println("Nome:    "+nome);
        System.out.println("Cargo:   "+getCargo());
        System.out.println("Salario: "+getSalario());
        System.out.println("");

    }




}
