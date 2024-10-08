abstract class FuncionarioE2 {
    private String nome;
    private String cpf;
    private double salario;

    public FuncionarioE2(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalario() {
        return salario;
    }

    public abstract double calcularSalario();
}