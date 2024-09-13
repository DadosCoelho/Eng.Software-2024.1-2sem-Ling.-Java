public class Main {
    public static void main(String[] args) {
        FazendaE2 fazenda = new FazendaE2();

        GadoE2 gado1 = new GadoE2(1, "Vaca1", 5, 500.0, 10.0);
        GadoE2 gado2 = new GadoE2(2, "Vaca2", 4, 450.0, 8.0);
        AveE2 ave1 = new AveE2(3, "Galinha1", 2, 2.5, 5);
        AveE2 ave2 = new AveE2(4, "Galinha2", 3, 3.0, 7);

        fazenda.adicionarAnimal(gado1);
        fazenda.adicionarAnimal(gado2);
        fazenda.adicionarAnimal(ave1);
        fazenda.adicionarAnimal(ave2);

        System.out.println("Animais com nome 'Galinha1': " + fazenda.buscarAnimalPorNome("Galinha1").size());
        fazenda.alimentarTodosOsAnimais(1.0);
        System.out.println("Produção total de leite: " + fazenda.calcularProducaoTotalDeLeite());
        System.out.println("Produção total de ovos: " + fazenda.calcularProducaoTotalDeOvos());

        fazenda.removerAnimal(1);
        System.out.println("Animais restantes: " + fazenda.buscarAnimalPorNome("Vaca1").size());
    }
}
