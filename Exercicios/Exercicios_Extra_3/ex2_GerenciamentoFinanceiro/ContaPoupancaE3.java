class ContaPoupancaE3 extends ContaE3 {
    private double taxaRendimento;

    public ContaPoupancaE3(String numeroConta, String titular, double saldo, double taxaRendimento) {
        super(numeroConta, titular, saldo);
        this.taxaRendimento = taxaRendimento;
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    @Override
    public void calcularSaldo() {
        // Considera a taxa de rendimento
        saldo += saldo * taxaRendimento;
    }
}
