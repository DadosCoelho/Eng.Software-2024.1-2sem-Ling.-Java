class ProdutoE3 {
    private String codigo;
    private String nome;
    private double preco;
    private int quantidade;

    public ProdutoE3(String codigo, String nome, double preco, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void adicionarEstoque(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removerEstoque(int quantidade) {
        this.quantidade -= quantidade;
    }

    public double calcularValorEstoque() {
        return this.preco * this.quantidade;
    }
}