public class NoDuplo {

    /* ATRIBUTOS DA CLASSE */

    // LIVRO ARMAZENADO NO NO
    private Livro livro;
    // REFERENCIA PARA O PROXIMO NO
    private NoDuplo proximo;
    // REFERENCIA PARA O NO ANTERIOR
    private NoDuplo anterior;

    /* METODOS DA CLASSE */

    // CONSTRUTOR DA CLASSE
    public NoDuplo(Livro livro) {
        this.livro = livro;
        this.proximo = null;
        this.anterior = null;
    }

    // RETORNA O LIVRO ARMAZENADO
    public Livro getLivro() {
        return livro;
    }

    // ALTERA O LIVRO ARMAZENADO
    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    // RETORNA O PROXIMO NO
    public NoDuplo getProximo() {
        return proximo;
    }

    // DEFINE O PROXIMO NO
    public void setProximo(NoDuplo proximo) {
        this.proximo = proximo;
    }

    // RETORNA O NO ANTERIOR
    public NoDuplo getAnterior() {
        return anterior;
    }

    // DEFINE O NO ANTERIOR
    public void setAnterior(NoDuplo anterior) {
        this.anterior = anterior;
    }
}