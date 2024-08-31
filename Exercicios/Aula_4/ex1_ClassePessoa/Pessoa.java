package Exercicios.Aula_4.ex1_ClassePessoa;

public class Pessoa {
    public String nome;
    public String cidade;
    private int cpf;
    private double salario;

    /*public Pessoa(int cpf){
        this.cpf = cpf;
    }*/

    public void exibirInformacoes() {
        System.out.println("Informações da pessoa:");
        System.out.println("Nome:  " + nome);
        System.out.println("Cidade: " + cidade);
        System.out.println("CPF: " + cpf);
        System.out.println("Salario: " + salario);
        System.out.println(" ");
        //subirDeCargo();
    }   

    private void subirDeCargoPrivado(){
        System.out.println(" ");
        salario += 500;
        System.out.println("Subiu de cargo!");
        System.out.println("Salario: " + salario);
        System.out.println(" ");
    }

    public void subirDeCargo(){
        subirDeCargoPrivado();
    }

    public void atualizarCpf(int cpf){
        System.out.println("CPF atulizado com sucesso!");
        System.out.println(" ");
        this.cpf = cpf;
    }


    /*public static void aniversario() {
        int novaIdade;
        novaIdade = idade + 1;
        System.out.println("Antes eu tinha " + idade + " anos de idade, mas agora tenho " + novaIdade + " anos.");
    }*/


}
