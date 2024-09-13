class FuncionarioHoristaE2 extends FuncionarioE2 {
    private int horasTrabalhadas;
    private double valorHora;

    public FuncionarioHoristaE2(String nome, String cpf, double salario, int horasTrabalhadas, double valorHora) {
        super(nome, cpf, salario);
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
        return getHorasTrabalhadas() * getValorHora();
    }
}
