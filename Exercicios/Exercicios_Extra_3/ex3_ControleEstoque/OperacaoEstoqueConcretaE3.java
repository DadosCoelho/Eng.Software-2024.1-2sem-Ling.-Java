class OperacaoEstoqueConcretaE3 implements OperacaoEstoqueE3 {
    private String idOperacao;
    private ProdutoE3 produto;
    private int quantidade;
    private String tipoOperacao;

    public OperacaoEstoqueConcretaE3(String idOperacao, ProdutoE3 produto, int quantidade, String tipoOperacao) {
        this.idOperacao = idOperacao;
        this.produto = produto;
        this.quantidade = quantidade;
        this.tipoOperacao = tipoOperacao;
    }

    public String getIdOperacao() {
        return idOperacao;
    }

    @Override
    public void executarOperacao() {
        if (tipoOperacao.equals("entrada")) {
            produto.adicionarEstoque(quantidade);
        } else if (tipoOperacao.equals("saida")) {
            produto.removerEstoque(quantidade);
        }
    }

    @Override
    public void cancelarOperacao() {
        if (tipoOperacao.equals("entrada")) {
            produto.removerEstoque(quantidade);
        } else if (tipoOperacao.equals("saida")) {
            produto.adicionarEstoque(quantidade);
        }
    }

    @Override
    public void gerarRelatorioOperacao() {
        System.out.println("ID da Operação: " + idOperacao);
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Tipo de Operação: " + tipoOperacao);
    }
}
