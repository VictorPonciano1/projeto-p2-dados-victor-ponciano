public class ListaDupla {

    /* ATRIBUTOS DA CLASSE */

    // PRIMEIRO NO DA LISTA
    private NoDuplo primeiro;
    // ULTIMO NO DA LISTA
    private NoDuplo ultimo;
    // QUANTIDADE DE ELEMENTOS DA LISTA
    private int tamanho;

    /* METODOS DA CLASSE */

    // CONSTRUTOR DA CLASSE
    public ListaDupla() {
        this.primeiro = null;
        this.ultimo = null;
        this.tamanho = 0;
    }

    // VERIFICA SE A LISTA ESTA VAZIA
    public boolean estaVazia() {
        return primeiro == null;
    }

    // INSERE LIVRO NO INICIO DA LISTA
    public void insereInicio(Livro livro) {
        NoDuplo novo = new NoDuplo(livro);
        if (estaVazia()) {
            primeiro = novo;
            ultimo = novo;
        } else {
            novo.setProximo(primeiro);
            primeiro.setAnterior(novo);
            primeiro = novo;
        }
        tamanho++;
    }

    // INSERE LIVRO NO FIM DA LISTA
    public void insereFim(Livro livro) {
        NoDuplo novo = new NoDuplo(livro);
        if (estaVazia()) {
            primeiro = novo;
            ultimo = novo;
        } else {
            ultimo.setProximo(novo);
            novo.setAnterior(ultimo);
            ultimo = novo;
        }
        tamanho++;
    }

    // REMOVE PRIMEIRO LIVRO DA LISTA
    public Livro removePrimeiro () {
        if (estaVazia()) {
            return null;
        }
        Livro livroRemovido = primeiro.getLivro();
        if (primeiro == ultimo) {
            primeiro = null;
            ultimo = null;
        } else {
            primeiro = primeiro.getProximo();
            primeiro.setAnterior(null);
        }
        tamanho--;
        return livroRemovido;
    }

    // REMOVE ULTIMO LIVRO DA LISTA
    public Livro removeUltimo () {
        if (estaVazia()) {
            return null;
        }
        Livro livroRemovido = ultimo.getLivro();
        if (primeiro == ultimo) {
            primeiro = null;
            ultimo = null;
        } else {
            ultimo = ultimo.getAnterior();
            ultimo.setProximo(null);
        }
        tamanho--;
        return livroRemovido;
    }

    // BUSCA LIVRO PELO ISBN
    public Livro buscarPorIsbn(String isbn) {
        NoDuplo atual = primeiro;
        while (atual != null) {
            if (atual.getLivro().getIsbn().equals(isbn)) {
                return atual.getLivro();
            }
            atual = atual.getProximo();
        }
        return null;
    }

    // EXIBE LIVROS DO INICIO
    public void listarDoInicio() {
        NoDuplo atual = primeiro;
        while (atual != null) {
            System.out.println(atual.getLivro());
            atual = atual.getProximo();
        }
    }

    // EXIBE LIVROS DO FIM
    public void listarDoFim() {
        NoDuplo atual = ultimo;
        while (atual != null) {
            System.out.println(atual.getLivro());
            atual = atual.getAnterior();
        }
    }

    // TAMANHO DA LISTA (QUANTIDADE DE LIVROS)
    public int getTamanho() {
        return tamanho;
    }
    
}