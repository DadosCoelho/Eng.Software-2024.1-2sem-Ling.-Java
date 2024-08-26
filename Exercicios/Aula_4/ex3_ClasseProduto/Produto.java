package Exercicios.Aula_4.ex3_ClasseProduto;

public class Produto {
    static String nome;
    static float preco;
    static int quantidade;
    static int quantidadeAnterior;

    public static void exibirProduto() {
        System.out.println(" Nome       = " + nome);
        System.out.println(" Preco      = " + preco);
        System.out.println(" Quantidade = " + quantidade);
    }

    public static void vender(int quantidadeVendida) {
        quantidadeAnterior = quantidade;
        if (quantidadeVendida < quantidade) {
            quantidade = quantidade - quantidadeVendida;
        }
        System.out.println(" Quantidade anterior = " + quantidadeAnterior);
        System.out.println(" Quantidade vendida = " + quantidadeVendida);
        System.out.println(" Quantidade atual = " + quantidade);
    }
}
