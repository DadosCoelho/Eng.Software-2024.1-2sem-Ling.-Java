public class AveE2 extends AnimalE2 {
    private int quantidadeDeOvos;

    public AveE2(int id, String nome, int idade, double peso, int quantidadeDeOvos) {
        super(id, nome, idade, peso);
        this.quantidadeDeOvos = quantidadeDeOvos;
    }

    public int getQuantidadeDeOvos() {
        return quantidadeDeOvos;
    }

    public int coletarOvos() {
        int ovosColetados = quantidadeDeOvos;
        quantidadeDeOvos = 0;
        return ovosColetados;
    }
}
