public class No<T> {

    /* ATRIBUTOS DA CLASSE */

    // INFORMACAO ARMAZENADA NO NO
    private T info;
    // REFERENCIA PARA O PROXIMO NO
    private No<T> proximo;

    /* METODOS DA CLASSE */

    // CONSTRUTOR DA CLASSE
    public No(T info) {
        this.info = info;
        this.proximo = null;
    }

    // INFORMACAO
    public T getInfo() {
        return info;
    }
    public void setInfo(T info) {
        this.info = info;
    }

    // PROXIMO NO
    public No<T> getProximo() {
        return proximo;
    }
    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }

    // REPRESENTACAO TEXTUAL/VISUAL DO NO
    @Override
    public String toString() {
        return "[" + info + "]";
    }
} 