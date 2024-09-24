import java.time.LocalDate;

public class FuncionarioHoristaE3 extends FuncionarioE3 {
    private int horasTrabalhadas;
    private double valorHora;

    public FuncionarioHoristaE3(String nome, String cpf, double salario, LocalDate dataEntrada, String cargo, int horasTrabalhadas, double valorHora) {
        super(nome, cpf, salario, dataEntrada, cargo);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabalhadas * valorHora;
    }
}
