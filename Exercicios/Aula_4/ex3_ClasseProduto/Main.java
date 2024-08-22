package Exercicios.Aula_4.ex3_ClasseProduto;

public class Main {
    public static void main(String[] args) {

        Produto meuProduto = new Produto();

        meuProduto.nome = "Arroz";
        meuProduto.preco = 12.5f;
        meuProduto.quantidade = 12;

        meuProduto.exibirProduto();
        meuProduto.vender(6);


        Produto meuProduto2 = new Produto();

        meuProduto2.nome = "Feijão";
        meuProduto2.preco = 25.7f;
        meuProduto2.quantidade = 36;

        meuProduto2.exibirProduto();

        meuProduto2.vender(10);

    }

}