import java.util.ArrayList;

class ProdutoE1 {
    private final String nome;
    private final String codigo;
    private final double preco;
    private int quantidade;

    public ProdutoE1(String nome, String codigo, double preco, int quantidade) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
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
        if (this.quantidade >= quantidade) {
            this.quantidade -= quantidade;
        } else {
            System.out.println("Estoque insuficiente.");
        }
    }
}

class LojaE1 {
    private final ArrayList<ProdutoE1> produtos;

    public LojaE1() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(ProdutoE1 produto) {
        produtos.add(produto);
    }

    public void removerProduto(String codigo) {
        produtos.removeIf(produto -> produto.getCodigo().equals(codigo));
    }

    public ArrayList<ProdutoE1> buscarProdutoPorNome(String nome) {
        ArrayList<ProdutoE1> resultado = new ArrayList<>();
        for (ProdutoE1 produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                resultado.add(produto);
            }
        }
        return resultado;
    }

    public ProdutoE1 buscarProdutoPorCodigo(String codigo) {
        for (ProdutoE1 produto : produtos) {
            if (produto.getCodigo().equals(codigo)) {
                return produto;
            }
        }
        return null;
    }

    public void venderProduto(String codigo, int quantidade) {
        ProdutoE1 produto = buscarProdutoPorCodigo(codigo);
        if (produto != null) {
            produto.removerEstoque(quantidade);
        } else {
            System.out.println("Produto não encontrado.");
        }
    }
}
