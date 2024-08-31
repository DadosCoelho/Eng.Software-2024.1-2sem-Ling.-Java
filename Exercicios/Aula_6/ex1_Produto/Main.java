package Exercicios.Aula_6.ex1_Produto;

public class Main {
    public static void main(String[] args) {
        ProdutoA6 celular = new ProdutoA6(1000);

        celular.nome = "A03";

        celular.informacaoProduto();
        celular.aplicarDesconto(65.5);
        celular.informacaoProduto();


    }
}
