package Exercicios.Aula_6.ex1_Produto;

public class ProdutoA6 {
    public String nome;
    private double preco;
    //private int idProduto;

    public ProdutoA6(double preco){
        this.preco = preco;
    }

    public void informacaoProduto(){
        System.out.println("Informações do produto");
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println(" ");
    }

    public void aplicarDesconto(double porcentagem){
        if(porcentagem >= 10 && porcentagem <= 90){    
            double desconto = porcentagem / 100;

            setPreco(getPreco() - (getPreco() * desconto));

            //preco = preco - (preco * desconto);
            System.out.println(" ");
            System.out.println("Aplicado desconto de: " + (desconto*100) + "%");
        } else{
        System.out.println("Valor Invalido!");
        }
    }

    public double getPreco(){
        return this.preco;
    }

    public String getNome(){
        return this.nome;
    }

    public void setPreco(double preco){
        //if(preco >=100){
        this.preco = preco;
        /*} else {
            System.out.println("Valor Invalido!");
        }*/
    }

    public void setNome(String nome){
        this.nome = nome;
    }
}
