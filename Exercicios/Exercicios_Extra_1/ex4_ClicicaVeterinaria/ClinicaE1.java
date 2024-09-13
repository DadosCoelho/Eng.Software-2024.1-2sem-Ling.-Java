import java.util.ArrayList;

class ClinicaE1 {
    private String nome;
    private String endereco;
    private ArrayList<VeterinarioE1> veterinarios;
    private ArrayList<AnimalE1> animais;

    public ClinicaE1(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.veterinarios = new ArrayList<>();
        this.animais = new ArrayList<>();
    }

    public void adicionarVeterinario(VeterinarioE1 veterinario) {
        veterinarios.add(veterinario);
    }

    public void removerVeterinario(String cpf) {
        veterinarios.removeIf(v -> v.getCpf().equals(cpf));
    }

    public void registrarAnimal(AnimalE1 animal) {
        animais.add(animal);
    }

    public void removerAnimal(String id) {
        animais.removeIf(a -> a.getId().equals(id));
    }

    public void listarVeterinarios() {
        for (VeterinarioE1 v : veterinarios) {
            System.out.println("Nome: " + v.getNome() + ", CPF: " + v.getCpf() + ", Especialidade: " + v.getEspecialidade());
        }
    }

    public void listarAnimais() {
        for (AnimalE1 a : animais) {
            System.out.println("ID: " + a.getId() + ", Nome: " + a.getNome() + ", Espécie: " + a.getEspecie() + ", Idade: " + a.getIdade() + ", Dono: " + a.getDono());
        }
    }

    public void agendarConsulta(String idAnimal, String cpfVeterinario, String data) {
        AnimalE1 animal = animais.stream().filter(a -> a.getId().equals(idAnimal)).findFirst().orElse(null);
        VeterinarioE1 veterinario = veterinarios.stream().filter(v -> v.getCpf().equals(cpfVeterinario)).findFirst().orElse(null);

        if (animal != null && veterinario != null) {
            String consulta = "Consulta com " + veterinario.getNome() + " em " + data;
            animal.adicionarConsulta(consulta);
            System.out.println("Consulta agendada: " + consulta);
        } else {
            System.out.println("Animal ou Veterinário não encontrado.");
        }
    }

    public void relatorioConsultasPorVeterinario(String cpf) {
        VeterinarioE1 veterinario = veterinarios.stream().filter(v -> v.getCpf().equals(cpf)).findFirst().orElse(null);

        if (veterinario != null) {
            System.out.println("Relatório de Consultas para o Veterinário: " + veterinario.getNome());
            for (AnimalE1 a : animais) {
                for (String consulta : a.getHistoricoConsultas()) {
                    if (consulta.contains(veterinario.getNome())) {
                        System.out.println("Animal: " + a.getNome() + ", Consulta: " + consulta);
                    }
                }
            }
        } else {
            System.out.println("Veterinário não encontrado.");
        }
    }

    public void relatorioConsultasPorAnimal(String id) {
        AnimalE1 animal = animais.stream().filter(a -> a.getId().equals(id)).findFirst().orElse(null);

        if (animal != null) {
            System.out.println("Relatório de Consultas para o Animal: " + animal.getNome());
            for (String consulta : animal.getHistoricoConsultas()) {
                System.out.println("Consulta: " + consulta);
            }
        } else {
            System.out.println("Animal não encontrado.");
        }
    }

    public void notificarConsulta(String idAnimal, String data) {
        AnimalE1 animal = animais.stream().filter(a -> a.getId().equals(idAnimal)).findFirst().orElse(null);

        if (animal != null) {
            System.out.println("Notificação: Consulta agendada para " + animal.getNome() + " em " + data);
        } else {
            System.out.println("Animal não encontrado.");
        }
    }
}
