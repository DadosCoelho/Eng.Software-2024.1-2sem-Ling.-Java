public class GadoE2 extends AnimalE2 {
    private double quantidadeDeLeite;

    public GadoE2(int id, String nome, int idade, double peso, double quantidadeDeLeite) {
        super(id, nome, idade, peso);
        this.quantidadeDeLeite = quantidadeDeLeite;
    }

    public double getQuantidadeDeLeite() {
        return quantidadeDeLeite;
    }

    public double ordenhar() {
        double leiteOrdenhado = quantidadeDeLeite;
        quantidadeDeLeite = 0;
        return leiteOrdenhado;
    }
}
