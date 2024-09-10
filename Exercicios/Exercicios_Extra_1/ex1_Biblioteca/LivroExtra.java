package Exercicios.Exercicios_Extra_1.ex1_Biblioteca;

public class LivroExtra {
    String titulo;
    String autor;
    String isbn;
    private boolean disponivel;

    public LivroExtra(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        setDisponivel(true);
    }

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
        if(getDisponivel()){
            setDisponivel(false);
            System.out.println("Livro "+getTitulo()+" emprestado!");
        } else {
            System.out.println("Livro "+getTitulo()+" já se encontra emprestado!");
        }
    }

    public void devolver(){
        if(getDisponivel()){
            System.out.println("Livro "+getTitulo()+" já se encontra disponivel!");            
        } else {
            setDisponivel(true);
            System.out.println("Livro "+getTitulo()+" devolvido!");
        }
    }


    @Override
    public String toString() {
        return "LivroExtra{" +
                "titulo='" + getAutor() + '\'' +
                ", autor='" + getAutor() + '\'' +
                ", isbn='" + getIsbn() + '\'' +
                ", disponivel='" + getDisponivel() + '\'' +
                '}';
    }
}
