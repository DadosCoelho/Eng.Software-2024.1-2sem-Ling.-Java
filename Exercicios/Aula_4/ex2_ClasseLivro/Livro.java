package Exercicios.Aula_4.ex2_ClasseLivro;

public class Livro {
    String titulo;
    String autor;
    int numeroDePaginas;

    public Livro(String titulo, int numeroDePaginas){
        this.titulo = titulo;
        this.numeroDePaginas = numeroDePaginas;
        autor = "João";
    }

    public void detalhesDoLivro() {
        System.out.println(" Detalhes do Livro");
        System.out.println(" Titulo  = " + titulo);
        System.out.println(" Autor   = " + autor);
        System.out.println(" Num Pag = " + numeroDePaginas + " páginas");
    }

    public boolean compararLivros(Livro outroLivro){
        if(this.numeroDePaginas >= outroLivro.numeroDePaginas){
            return true;
        } else {
            return false;
        }
    }
}
