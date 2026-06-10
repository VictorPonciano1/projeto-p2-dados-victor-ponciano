public class Catalogo {

    /* ATRIBUTOS DA CLASSE */

    // TABELA HASH QUE ARMAZENA OS LIVROS PELO ISBN
    private NossoHash<String, Livro> livros;

    /* METODOS DA CLASSE */

    // CONSTRUTOR DA CLASSE
    public Catalogo() {
        this.livros = new NossoHash<>();
    }

    // CADASTRA UM LIVRO NO CATALOGO
    public void cadastrar(Livro livro) {
        livros.put(livro.getIsbn(), livro);
    }

    // BUSCA UM LIVRO PELO ISBN
    public Livro buscar(String isbn) {
        return livros.get(isbn);
    }

    // VERIFICA SE UM LIVRO EXISTE NO CATALOGO
    public boolean existe(String isbn) {
        return livros.containsKey(isbn);
    }

    // EXIBE O CATALOGO DE LIVROS
    public void exibirCatalogo() {
        livros.exibeMap();
    }

}