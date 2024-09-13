class FuncionarioMensalistaE2 extends FuncionarioE2 {
    private double salarioMensal;

    public FuncionarioMensalistaE2(String nome, String cpf, double salario, double salarioMensal) {
        super(nome, cpf, salario);
        this.salarioMensal = salarioMensal;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    @Override
    public double calcularSalario() {
        return getSalarioMensal();
    }
}