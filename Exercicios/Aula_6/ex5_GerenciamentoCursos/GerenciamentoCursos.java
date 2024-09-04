package Exercicios.Aula_6.ex5_GerenciamentoCursos;

public class GerenciamentoCursos {
    public String titulo;
    private int duracaoHoras;
    private int vagasDisponiveis;

    public GerenciamentoCursos(String titulo, int duracaoHoras, int vagasDisponiveis){
        this.titulo = titulo;
        this.duracaoHoras = duracaoHoras;
        this.vagasDisponiveis = vagasDisponiveis;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public int getDuracaoHoras(){
        return duracaoHoras;
    }

    public void setDuracaoHoras(int duracaoHoras){
        this.duracaoHoras = duracaoHoras;
    }

    public int getVagasDisponiveis(){
        return vagasDisponiveis;
    }

    public void setVagasDisponiveis(int vagasDisponiveis){
        this.vagasDisponiveis = vagasDisponiveis;
    }

    public void matricularAluno(){
        if(getVagasDisponiveis()>=1){
            //vagasDisponiveis = vagasDisponiveis - 1;
            setVagasDisponiveis(getVagasDisponiveis()-1);
            System.out.println(" ");
            System.out.println("Foi Matriculado 1 aluno!");
            System.out.println(" ");
        } else {
            System.out.println(" ");
            System.out.println("Não possue vagas disponivel!");
            System.out.println(" ");
        }
    }

    public void cancelarMatriculas(){
        //vagasDisponiveis = vagasDisponiveis + 1;
        setVagasDisponiveis(getVagasDisponiveis()+1);
        System.out.println(" ");
        System.out.println("1 Matricula foi Cancelada!");
        System.out.println(" ");
    }

    public void exibirInformacoes(){
        System.out.println("Informações de cursos");
        System.out.println("Titulo: "+getTitulo());
        System.out.println("Duração: "+getDuracaoHoras());
        System.out.println("Vagas Disponiveis: "+getVagasDisponiveis());
        System.out.println(" ");
    }


}
