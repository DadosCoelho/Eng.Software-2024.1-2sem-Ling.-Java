import java.util.ArrayList;


class GerenciadorFinanceiroE3 {
    private ArrayList<ContaE3> contas;
    private ArrayList<TransacaoE3> transacoes;

    public GerenciadorFinanceiroE3() {
        contas = new ArrayList<>();
        transacoes = new ArrayList<>();
    }

    public void adicionarConta(ContaE3 conta) {
        contas.add(conta);
    }

    public void removerConta(String numeroConta) {
        contas.removeIf(conta -> conta.getNumeroConta().equals(numeroConta));
    }

    public ArrayList<ContaE3> buscarContaPorTitular(String titular) {
        ArrayList<ContaE3> contasEncontradas = new ArrayList<>();
        for (ContaE3 conta : contas) {
            if (conta.getTitular().equals(titular)) {
                contasEncontradas.add(conta);
            }
        }
        return contasEncontradas;
    }

    public void adicionarTransacao(TransacaoE3 transacao) {
        transacoes.add(transacao);
    }

    public void removerTransacao(String idTransacao) {
        transacoes.removeIf(transacao -> ((TransacaoConcretaE3) transacao).getIdTransacao().equals(idTransacao));
    }

    public double calcularSaldoTotal() {
        double saldoTotal = 0;
        for (ContaE3 conta : contas) {
            saldoTotal += conta.getSaldo();
        }
        return saldoTotal;
    }

    public String gerarRelatorioFinanceiro() {
        StringBuilder relatorio = new StringBuilder();
        for (TransacaoE3 transacao : transacoes) {
            relatorio.append(transacao.gerarRelatorio()).append("\n");
        }
        return relatorio.toString();
    }
}

