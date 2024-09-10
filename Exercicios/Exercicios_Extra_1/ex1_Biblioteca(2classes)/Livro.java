package Exercicios.Exercicios_Extra_1.ex1_Biblioteca(2classes);

public class Livro {
    String titulo;
    String autor;
    String isbn;
    boolean disponivel;

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public String getIsbn(){
        return isbn;
    }

    public void setIsbn(String isbn){
        this.isbn = isbn;
    }

    public boolean getDisponivel(){
        return disponivel;
    }

    public void setDisponivel(boolean disponivel){
        this.disponivel = disponivel;
    }

    public void emprestar(){
        setDisponivel(false);
    }




}
