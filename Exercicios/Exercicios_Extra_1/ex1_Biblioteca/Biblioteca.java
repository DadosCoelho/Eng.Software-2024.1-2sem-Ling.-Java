package Exercicios.Exercicios_Extra_1.ex1_Biblioteca;

import java.util.ArrayList;

public class Biblioteca {
    private String nome;
    private ArrayList<LivroExtra> livros;

    public Biblioteca(String nome) {
        this.nome = nome;
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(LivroExtra livro) {
        livros.add(livro);
    }

    public void listarLivros() {
        for (LivroExtra livro : livros) {
            System.out.println(livro);
        }
    }
    
}
