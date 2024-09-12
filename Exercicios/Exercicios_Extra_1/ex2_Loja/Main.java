public class Main {
    public static void main(String[] args) {
        LojaE1 loja = new LojaE1();

        ProdutoE1 produto1 = new ProdutoE1("Arroz", "001", 5.50, 100);
        ProdutoE1 produto2 = new ProdutoE1("Feijão", "002", 7.00, 50);

        loja.adicionarProduto(produto1);
        loja.adicionarProduto(produto2);

        System.out.println("Produtos com nome 'Arroz': " + loja.buscarProdutoPorNome("Arroz"));
        System.out.println("Produto com código '002': " + loja.buscarProdutoPorCodigo("002"));

        loja.venderProduto("001", 10);
        System.out.println("Quantidade de 'Arroz' após venda: " + produto1.getQuantidade());

        loja.removerProduto("002");
        System.out.println("Produto com código '002' após remoção: " + loja.buscarProdutoPorCodigo("002"));
    }
}

