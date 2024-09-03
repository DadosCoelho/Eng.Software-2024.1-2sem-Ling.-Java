package Exercicios.Aula_6.ex3_ControleEstoque;

public class ControleEstoque {
    public String item;
    private int quantidade;

    public ControleEstoque(String item){
        this.item = item;
    }

    public void detalheEstoque(){
        System.out.println(" ");
        System.out.println("Item: "+item);
        System.out.println("Qtd: "+quantidade);
        System.out.println(" ");
    }

    public void adicionarEstoque(int quantidade){
        this.quantidade = this.quantidade + quantidade;
        System.out.println("Adicionado "+quantidade+" quantidades no item "+item);
    }

    public void removerEstoque(int quantidade){
        this.quantidade = this.quantidade - quantidade;
        System.out.println("Removido "+quantidade+" quantidades no item "+item);
    }

}
