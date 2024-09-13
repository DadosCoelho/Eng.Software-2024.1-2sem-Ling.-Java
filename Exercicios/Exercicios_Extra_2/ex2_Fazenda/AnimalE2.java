public class AnimalE2 {
    private int id;
    private String nome;
    private int idade;
    private double peso;

    public AnimalE2(int id, String nome, int idade, double peso) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    public void alimentar(double quantidade) {
        this.peso += quantidade;
    }
}
