import java.util.ArrayList;


class SupermercadoE3 {
    private ArrayList<ProdutoE3> produtos;
    private ArrayList<OperacaoEstoqueE3> operacoes;

    public SupermercadoE3() {
        this.produtos = new ArrayList<>();
        this.operacoes = new ArrayList<>();
    }

    public void adicionarProduto(ProdutoE3 produto) {
        produtos.add(produto);
    }

    public void removerProduto(String codigo) {
        produtos.removeIf(produto -> produto.getCodigo().equals(codigo));
    }

    public ArrayList<ProdutoE3> buscarProdutoPorNome(String nome) {
        ArrayList<ProdutoE3> resultado = new ArrayList<>();
        for (ProdutoE3 produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                resultado.add(produto);
            }
        }
        return resultado;
    }

    public void adicionarOperacao(OperacaoEstoqueE3 operacao) {
        operacoes.add(operacao);
    }

    public void removerOperacao(String idOperacao) {
        operacoes.removeIf(operacao -> ((OperacaoEstoqueConcretaE3) operacao).getIdOperacao().equals(idOperacao));
    }

    public double calcularValorTotalEstoque() {
        double valorTotal = 0;
        for (ProdutoE3 produto : produtos) {
            valorTotal += produto.calcularValorEstoque();
        }
        return valorTotal;
    }

    public void gerarRelatorioEstoque() {
        System.out.println("Relatório de Estoque:");
        for (ProdutoE3 produto : produtos) {
            System.out.println("Produto: " + produto.getNome() + ", Quantidade: " + produto.getQuantidade() + ", Valor em Estoque: " + produto.calcularValorEstoque());
        }
        System.out.println("Relatório de Operações:");
        for (OperacaoEstoqueE3 operacao : operacoes) {
            operacao.gerarRelatorioOperacao();
        }
    }
}

