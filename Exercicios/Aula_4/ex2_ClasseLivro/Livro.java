package Exercicios.Aula_4.ex2_ClasseLivro;

public class Livro {
    static String titulo = "A volta dos que não foram";
    static String autor = "Desconhecido";
    static int numeroDePaginas = 657;

    public static void detalhesDoLivro() {
        System.out.println(" Titulo  = " + titulo);
        System.out.println(" Autor   = " + autor);
        System.out.println(" Num Pag = " + numeroDePaginas + " páginas");
    }



    public static void main(String[] args) {
        detalhesDoLivro();
    }
}
