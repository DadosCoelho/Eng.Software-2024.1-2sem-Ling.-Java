class TransacaoConcretaE3 implements TransacaoE3 {
    private String idTransacao;
    private ContaE3 conta;
    private double valor;
    private String tipo;

    public TransacaoConcretaE3(String idTransacao, ContaE3 conta, double valor, String tipo) {
        this.idTransacao = idTransacao;
        this.conta = conta;
        this.valor = valor;
        this.tipo = tipo;
    }

    public String getIdTransacao() {
        return idTransacao;
    }

    @Override
    public void executar() {
        if (tipo.equals("deposito")) {
            conta.depositar(valor);
        } else if (tipo.equals("saque")) {
            conta.sacar(valor);
        }
    }

    @Override
    public void cancelar() {
        if (tipo.equals("deposito")) {
            conta.sacar(valor);
        } else if (tipo.equals("saque")) {
            conta.depositar(valor);
        }
    }

    @Override
    public String gerarRelatorio() {
        return "Transacao ID: " + idTransacao + ", Tipo: " + tipo + ", Valor: " + valor + ", Conta: " + conta.getNumeroConta();
    }
}

