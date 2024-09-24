import java.time.LocalDate;

public class FuncionarioMensalistaE3 extends FuncionarioE3 {
    private double salarioMensal;

    public FuncionarioMensalistaE3(String nome, String cpf, double salario, LocalDate dataEntrada, String cargo, double salarioMensal) {
        super(nome, cpf, salario, dataEntrada, cargo);
        this.salarioMensal = salarioMensal;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    @Override
    public double calcularSalario() {
        return salarioMensal;
    }
}
