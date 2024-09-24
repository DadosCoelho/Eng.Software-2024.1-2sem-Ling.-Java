class ProdutoNaoPerecivelE3 extends ProdutoE3 {
    private int garantia;

    public ProdutoNaoPerecivelE3(String codigo, String nome, double preco, int quantidade, int garantia) {
        super(codigo, nome, preco, quantidade);
        this.garantia = garantia;
    }

    public int getGarantia() {
        return garantia;
    }
}

