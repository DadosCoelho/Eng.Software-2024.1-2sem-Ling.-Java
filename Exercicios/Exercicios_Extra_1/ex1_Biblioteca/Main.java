package Exercicios.Exercicios_Extra_1.ex1_Biblioteca;

public class Main {
    public static void main(String[] args) {
        
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        
        LivroExtra livro1 = new LivroExtra("O Senhor dos Anéis", "J.R.R. Tolkien", "123456789");
        LivroExtra livro2 = new LivroExtra("1984", "George Orwell", "987654321");

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        biblioteca.listarLivros();

        livro1.emprestar();

        biblioteca.listarLivros();


    }
}
