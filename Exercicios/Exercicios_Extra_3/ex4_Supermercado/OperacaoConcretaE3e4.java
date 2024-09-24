public class OperacaoConcretaE3e4 implements OperacaoE3e4 {
    private String idOperacao;
    private ProdutoE3e4 produto;
    private int quantidade;
    private String tipoOperacao;
    private ContaE3e4 conta;

    public OperacaoConcretaE3e4(String idOperacao, ProdutoE3e4 produto, int quantidade, String tipoOperacao, ContaE3e4 conta) {
        this.idOperacao = idOperacao;
        this.produto = produto;
        this.quantidade = quantidade;
        this.tipoOperacao = tipoOperacao;
        this.conta = conta;
    }

    public String getIdOperacao() {
        return idOperacao;
    }

    @Override
    public void executar() {
        if (tipoOperacao.equals("entrada")) {
            produto.adicionarEstoque(quantidade);
            conta.sacar(produto.getPreco() * quantidade);
        } else if (tipoOperacao.equals("saida")) {
            produto.removerEstoque(quantidade);
            conta.depositar(produto.getPreco() * quantidade);
        }
    }

    @Override
    public void cancelar() {
        if (tipoOperacao.equals("entrada")) {
            produto.removerEstoque(quantidade);
            conta.depositar(produto.getPreco() * quantidade);
        } else if (tipoOperacao.equals("saida")) {
            produto.adicionarEstoque(quantidade);
            conta.sacar(produto.getPreco() * quantidade);
        }
    }

    @Override
    public String gerarRelatorio() {
        return "Operação: " + idOperacao + ", Produto: " + produto.getNome() + ", Quantidade: " + quantidade + ", Tipo: " + tipoOperacao;
    }
}
