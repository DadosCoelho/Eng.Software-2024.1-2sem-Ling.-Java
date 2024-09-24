class ContaCorrenteE3 extends ContaE3 {
    private double limiteChequeEspecial;

    public ContaCorrenteE3(String numeroConta, String titular, double saldo, double limiteChequeEspecial) {
        super(numeroConta, titular, saldo);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    @Override
    public void calcularSaldo() {
        // Considera o limite do cheque especial
        saldo += limiteChequeEspecial;
    }
}
