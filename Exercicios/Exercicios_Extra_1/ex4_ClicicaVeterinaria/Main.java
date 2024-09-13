public class Main {
    public static void main(String[] args) {
        ClinicaE1 clinica = new ClinicaE1("Clínica Vet", "Rua das Flores, 123");

        VeterinarioE1 vet1 = new VeterinarioE1("Dr. João", "12345678900", "Cirurgia");
        VeterinarioE1 vet2 = new VeterinarioE1("Dra. Maria", "09876543211", "Dermatologia");

        clinica.adicionarVeterinario(vet1);
        clinica.adicionarVeterinario(vet2);

        AnimalE1 animal1 = new AnimalE1("001", "Rex", "Cachorro", 5, "Carlos");
        AnimalE1 animal2 = new AnimalE1("002", "Mimi", "Gato", 3, "Ana");

        clinica.registrarAnimal(animal1);
        clinica.registrarAnimal(animal2);

        clinica.agendarConsulta("001", "12345678900", "12/09/2024");
        clinica.agendarConsulta("002", "09876543211", "13/09/2024");

        clinica.listarVeterinarios();
        clinica.listarAnimais();

        clinica.relatorioConsultasPorVeterinario("12345678900");
        clinica.relatorioConsultasPorAnimal("001");

        clinica.notificarConsulta("001", "12/09/2024");
    }
}