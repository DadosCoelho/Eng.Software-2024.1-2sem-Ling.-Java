package Exercicios.Aula_4.ex2_ClasseLivro;

public class Main {
    public static void main(String[] args) {

        Livro MeuLivro = new Livro("Senhor dos aneis", 25);

        /*MeuLivro.titulo = "A volta dos que não foram";
        MeuLivro.autor = "Desconhecido";
        MeuLivro.numeroDePaginas = 657;*/

        MeuLivro.detalhesDoLivro();

        Livro MeuLivro2 = new Livro("A regra do jogo", 20);

        /*MeuLivro2.titulo = "A volta dos que foram";
        MeuLivro2.autor = "Conhecido";
        MeuLivro2.numeroDePaginas = 412;*/

        MeuLivro2.detalhesDoLivro();

        System.out.println(MeuLivro.compararLivros(MeuLivro2));
        System.out.println(MeuLivro2.compararLivros(MeuLivro));
    }

}