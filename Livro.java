public class Livro {

/* ATRIBUTOS DA CLASSE */

    // ISBN DO LIVRO
    private String isbn;
    // TITULO DO LIVRO
    private String titulo;
    // AUTOR DO LIVRO
    private String autor;
    // ANO DE PUBLICACAO DO LIVRO
    private int anoPub;
    // INDICA SE ESTA DISPONIVEL PARA EMPRESTIMO
    private boolean disponivel;

/* METODOS DA CLASSE */

    // CONSTRUTOR DA CLASSE
    public Livro(String isbn, String titulo, String autor, int anoPub) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.anoPub = anoPub;
        this.disponivel = true;
    }

    /* GETTERS E SETTERS */

    // ISBN
    public String getIsbn() {
        return isbn;
    }

    // TITULO
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // AUTOR
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    // ANO DE PUBLICACAO
    public int getAnoPub() {
        return anoPub;
    }

    // DISPONIBILIDADE
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    /* OUTROS METODOS */

    // TOSTRING
    @Override
     public String toString() {
        String status = disponivel ? "DISPONIVEL" : "EMPRESTADO";
        return "[" + isbn + "] "
                + titulo + " - "
                + autor + " (" + anoPub + ") ["
                + status + "]";
    }

    // METODO EQUALS - COMPARA DOIS LIVROS PELO ISBN
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Livro outro = (Livro) obj;
        return isbn.equals(outro.isbn);
    }

}