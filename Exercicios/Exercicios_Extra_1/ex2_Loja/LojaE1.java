package Exercicios.Exercicios_Extra_1.ex2_Loja;

import java.util.ArrayList;

public class LojaE1 {
    private ArrayList<ProdutoE1> produtos;

    public LojaE1() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(ProdutoE1 produto){
        produtos.add(produto);
    }

    public boolean removerProduto(String codigo){
        for(ProdutoE1 produto : produtos) {
            if(produto.getCodigo().equals(codigo)){
                produtos.remove(produto);
                return true;
            }
        }
        return false;
    }

    public ProdutoE1 buscarProdutoPorNome(String nome){
        for (ProdutoE1 produto : produtos) {
            if (produto.getNome().equals(nome)) {
                return produto;
            }
        }
        return null;
    }

    public ProdutoE1 buscarProdutoPorCodigo(String codigo){
        for (ProdutoE1 produto : produtos) {
            if (produto.getCodigo().equals(codigo)) {
                return produto;
            }
        }
        return null;
    }

    public boolean venderProduto(String codigo, int quantidade){
        ProdutoE1 produto = buscarProdutoPorCodigo(codigo);
        if (produto != null) {
            if (produto.removerEstoque(quantidade)) {
                return true;
            } else {
                System.out.println("Estoque insuficiente.");
                return false;
            }
        } else {
            System.out.println("Produto não encontrado.");
            return false;
        }
    }
    
}
