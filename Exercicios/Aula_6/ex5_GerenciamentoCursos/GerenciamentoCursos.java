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

    public void matricularAluno(){
        vagasDisponiveis = vagasDisponiveis - 1;
        System.out.println(" ");
        System.out.println("Foi Matriculado 1 aluno!");
        System.out.println(" ");
    }

    public void cancelarMatriculas(){
        vagasDisponiveis = vagasDisponiveis + 1;
        System.out.println(" ");
        System.out.println("1 Matricula foi Cancelada!");
        System.out.println(" ");
    }

    public void exibirInformacoes(){
        System.out.println("Informações de cursos");
        System.out.println("Titulo: "+titulo);
        System.out.println("Duração: "+duracaoHoras);
        System.out.println("Vagas Disponiveis: "+vagasDisponiveis);
        System.out.println(" ");
    }


}
