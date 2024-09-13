import java.util.ArrayList;

public class FazendaE2 {
    private ArrayList<AnimalE2> animais;

    public FazendaE2() {
        this.animais = new ArrayList<>();
    }

    public void adicionarAnimal(AnimalE2 animal) {
        animais.add(animal);
    }

    public void removerAnimal(int id) {
        animais.removeIf(animal -> animal.getId() == id);
    }

    public ArrayList<AnimalE2> buscarAnimalPorNome(String nome) {
        ArrayList<AnimalE2> resultado = new ArrayList<>();
        for (AnimalE2 animal : animais) {
            if (animal.getNome().equalsIgnoreCase(nome)) {
                resultado.add(animal);
            }
        }
        return resultado;
    }

    public void alimentarTodosOsAnimais(double quantidade) {
        for (AnimalE2 animal : animais) {
            animal.alimentar(quantidade);
        }
    }

    public double calcularProducaoTotalDeLeite() {
        double totalLeite = 0;
        for (AnimalE2 animal : animais) {
            if (animal instanceof GadoE2) {
                totalLeite += ((GadoE2) animal).getQuantidadeDeLeite();
            }
        }
        return totalLeite;
    }

    public int calcularProducaoTotalDeOvos() {
        int totalOvos = 0;
        for (AnimalE2 animal : animais) {
            if (animal instanceof AveE2) {
                totalOvos += ((AveE2) animal).getQuantidadeDeOvos();
            }
        }
        return totalOvos;
    }
}
