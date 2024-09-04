package Exercicios.Aula_6.ex3_ControleEstoque;

public class ControleEstoque {
    public String item;
    private int quantidade;
    
    public ControleEstoque(String item){
        //setItem(item);
        this.item = item;
    }
    
    public String getItem(){
        return item;
    }
    
    public void setItem(String item){
        this.item = item;
    }
    
    public int getQuantidade(){
        return quantidade;
    }
    
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public void detalheEstoque(){
        System.out.println(" ");
        System.out.println("Item: " + getItem());
        System.out.println("Qtd: " + getQuantidade());
        System.out.println(" ");
    }

    public void adicionarEstoque(int quantidade){
        if(quantidade > 0){
            //this.quantidade = this.quantidade + quantidade;
            setQuantidade(getQuantidade() + quantidade);
            System.out.println("Adicionado " + quantidade + " quantidades no item "+getItem());
        } else {
            System.out.println("Não é possivel adicionar valores negativos");
        }
    }

    public void removerEstoque(int quantidade){
        if(quantidade > 0 && quantidade < getQuantidade()){
            //this.quantidade = this.quantidade - quantidade;
            setQuantidade(getQuantidade() - quantidade);
            System.out.println("Removido "+quantidade+" quantidades no item "+getItem());
        } else {
            System.out.println("Não é possivel remover valores negativos ou superiores ao estoque atual!");
        }
    }

}
