public class Main {
    public static void main(String[] args) {
        GerenciadorFinanceiroE3 gerenciador = new GerenciadorFinanceiroE3();

        ContaCorrenteE3 cc = new ContaCorrenteE3("123", "João", 1000.0, 500.0);
        ContaPoupancaE3 cp = new ContaPoupancaE3("456", "Maria", 2000.0, 0.02);

        gerenciador.adicionarConta(cc);
        gerenciador.adicionarConta(cp);

        TransacaoE3 deposito = new TransacaoConcretaE3("001", cc, 200.0, "deposito");
        TransacaoE3 saque = new TransacaoConcretaE3("002", cp, 100.0, "saque");

        gerenciador.adicionarTransacao(deposito);
        gerenciador.adicionarTransacao(saque);

        deposito.executar();
        saque.executar();

        System.out.println("Saldo total: " + gerenciador.calcularSaldoTotal());
        System.out.println("Relatório financeiro:\n" + gerenciador.gerarRelatorioFinanceiro());
    }
}
