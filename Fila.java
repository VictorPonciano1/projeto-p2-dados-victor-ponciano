public class Fila<T> {

    /* ATRIBUTOS DA CLASSE */

    // PRIMEIRO NO DA FILA
    private No<T> primeiro;
    // ULTIMO NO DA FILA
    private No<T> ultimo;
    // QUANTIDADE DE ELEMENTOS DA FILA
    private int tamanho;

    /* METODOS DA CLASSE */

    // CONSTRUTOR DA CLASSE
    public Fila() {
        this.primeiro = null;
        this.ultimo = null;
        this.tamanho = 0;
    }

    // VERIFICA SE A FILA ESTA VAZIA
    public boolean filaVazia() {
        return primeiro == null;
    }

    // RETORNA A QUANTIDADE DE ELEMENTOS DA FILA
    public int tamanho() {
        return tamanho;
    }

    // INSERE UM ELEMENTO NO FINAL DA FILA
    public void enfileira(T info) {
        No<T> novo = new No<>(info);
        if (filaVazia()) {
            primeiro = novo;
            ultimo = novo;
        } else {
            ultimo.setProximo(novo);
            ultimo = novo;
        }
        tamanho++;
    }    

    // REMOVE O PRIMEIRO ELEMENTO DA FILA
    public T desenfileira() {
        if (filaVazia()) {
            throw new FilaVaziaException();
        }
        T info = primeiro.getInfo();
        primeiro = primeiro.getProximo();
        tamanho--;
        if (primeiro == null) {
            ultimo = null;
        }
        return info;
    }

    // RETORNA O PRIMEIRO ELEMENTO DA FILA SEM REMOVER
    public T primeiro() {
        if (filaVazia()) {
            throw new FilaVaziaException();
        }
        return primeiro.getInfo();
    }

    // REPRESENTACAO TEXTUAL DA FILA
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        No<T> atual = primeiro;
        while (atual != null) {
            sb.append("[").append(atual.getInfo()).append("]->");
            atual = atual.getProximo();
        }
        sb.append("//");
        return sb.toString();
    }
}