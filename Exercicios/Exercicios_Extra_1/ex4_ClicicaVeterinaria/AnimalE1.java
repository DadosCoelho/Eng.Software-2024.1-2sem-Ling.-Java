import java.util.ArrayList;

class AnimalE1 {
    private String id;
    private String nome;
    private String especie;
    private int idade;
    private String dono;
    private ArrayList<String> historicoConsultas;

    public AnimalE1(String id, String nome, String especie, int idade, String dono) {
        this.id = id;
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
        this.dono = dono;
        this.historicoConsultas = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    public int getIdade() {
        return idade;
    }

    public String getDono() {
        return dono;
    }

    public void adicionarConsulta(String consulta) {
        historicoConsultas.add(consulta);
    }

    public ArrayList<String> getHistoricoConsultas() {
        return historicoConsultas;
    }
}