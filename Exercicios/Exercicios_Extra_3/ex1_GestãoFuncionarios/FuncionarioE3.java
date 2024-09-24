import java.time.LocalDate;

public abstract class FuncionarioE3 {
    private String nome;
    private String cpf;
    private double salario;
    private LocalDate dataEntrada;
    private boolean ativo;
    private String cargo;

    public FuncionarioE3(String nome, String cpf, double salario, LocalDate dataEntrada, String cargo) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.dataEntrada = dataEntrada;
        this.ativo = true;
        this.cargo = cargo;
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

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public String getCargo() {
        return cargo;
    }

    public abstract double calcularSalario();

    public void demitir() {
        this.ativo = false;
    }
}
