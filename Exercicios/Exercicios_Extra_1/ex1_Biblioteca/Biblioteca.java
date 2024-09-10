package Exercicios.Exercicios_Extra_1.ex1_Biblioteca;

import java.util.ArrayList;

public class Biblioteca {
    private String nome;
    private ArrayList<LivroExtra> livros;
    
    public Biblioteca(String nome) {
        this.nome = nome;
        this.livros = new ArrayList<>();
    }

    public ArrayList<LivroExtra> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<LivroExtra> livros) {
        this.livros = livros;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
