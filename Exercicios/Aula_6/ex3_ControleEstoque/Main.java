package Exercicios.Aula_6.ex3_ControleEstoque;


public class Main {
    public static void main(String[] args) {
        ControleEstoque item1 = new ControleEstoque("Caderno");

        item1.detalheEstoque();
        item1.adicionarEstoque(50);
        item1.detalheEstoque();
        item1.removerEstoque(10);
        item1.detalheEstoque();
        item1.removerEstoque(50);
        item1.adicionarEstoque(50);
        item1.detalheEstoque();
    }
    
}
