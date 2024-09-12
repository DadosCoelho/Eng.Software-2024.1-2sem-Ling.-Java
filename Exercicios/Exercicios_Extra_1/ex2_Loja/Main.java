package Exercicios.Exercicios_Extra_1.ex2_Loja;

public class Main {
    public static void main(String[] args) {
        
        //LojaE1 loja = new LojaE1();

        // Adicionando produtos
        ProdutoE1 produto1 = new ProdutoE1("001", "Caneta", 2, 100);
        //ProdutoE1 produto2 = new ProdutoE1("002", "Caderno", 15,50);
        
        System.out.println("Nome: " + produto1.getNome());
        
        
        /*

        loja.adicionarProduto(produto1);
        loja.adicionarProduto(produto2);
        
        // Buscando produtos
        System.out.println("Buscando por nome 'Caneta': " + loja.buscarProdutosPorNome("Caneta"));
        System.out.println("Buscando por código '002': " + loja.buscarProdutoPorCodigo("002"));

        // Vendendo produtos
        if (loja.venderProduto("001", 10)) {
            System.out.println("Venda realizada com sucesso!");
        } else {
            System.out.println("Falha na venda.");
        }

        // Removendo produtos
        if (loja.removerProduto("002")) {
            System.out.println("Produto removido com sucesso!");
        } else {
            System.out.println("Produto não encontrado.");
        }
            
        */
    }
}
