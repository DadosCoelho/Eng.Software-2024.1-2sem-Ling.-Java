import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        SupermercadoE3 supermercado = new SupermercadoE3();

        ProdutoPerecivelE3 leite = new ProdutoPerecivelE3("001", "Leite", 4.50, 100, "2024-12-31");
        ProdutoNaoPerecivelE3 arroz = new ProdutoNaoPerecivelE3("002", "Arroz", 20.00, 50, 12);

        supermercado.adicionarProduto(leite);
        supermercado.adicionarProduto(arroz);

        OperacaoEstoqueE3 entradaLeite = new OperacaoEstoqueConcretaE3("OP001", leite, 20, "entrada");
        OperacaoEstoqueE3 saidaArroz = new OperacaoEstoqueConcretaE3("OP002", arroz, 10, "saida");

        supermercado.adicionarOperacao(entradaLeite);
        supermercado.adicionarOperacao(saidaArroz);

        entradaLeite.executarOperacao();
        saidaArroz.executarOperacao();

        System.out.println("Valor total do estoque: " + supermercado.calcularValorTotalEstoque());

        ArrayList<ProdutoE3> produtosEncontrados = supermercado.buscarProdutoPorNome("Leite");
        for (ProdutoE3 produto : produtosEncontrados) {
            System.out.println("Produto encontrado: " + produto.getNome());
        }

        supermercado.gerarRelatorioEstoque();
    }
}
