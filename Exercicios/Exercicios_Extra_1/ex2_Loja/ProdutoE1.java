package Exercicios.Exercicios_Extra_1.ex2_Loja;

public class ProdutoE1 {
    private String nome;
    private String codigo;
    private double preco;
    private int quantidade;

    public ProdutoE1(String nome, String codigo, double preco, int qualidade) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidade = quantidade;
    }    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void adicionarEstoque(int quantidade){
        if(quantidade > 0){
            setQuantidade(getQuantidade() + quantidade);
            System.out.println("Foi adicionado " + quantidade + " ao estoque do produto " + getNome() + "!");
        } else {
            System.out.println("Quantidade informada inválida para adicionar ao estoque do produto " + getNome() + "!");
        }
    }

    public boolean removerEstoque(int quantidade) {
        if (this.quantidade >= quantidade) {
            this.quantidade -= quantidade;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "ProdutoE1{" +
                "nome='" + getNome() + '\'' +
                ", codigo='" + getCodigo() + '\'' +
                ", preco='" + getPreco() + '\'' +
                ", quantidade='" + getQuantidade() + '\'' +
                '}';
    }

    
}
