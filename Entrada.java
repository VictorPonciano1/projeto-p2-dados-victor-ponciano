public class Entrada<K, V> {

    /* ATRIBUTOS DA CLASSE */

    // CHAVE DA ENTRADA
    K key;
    // VALOR ASSOCIADO A CHAVE
    V value;

    // PROXIMA ENTRADA DA LISTA ENCADEADA
    Entrada<K, V> proximo;

    /* METODOS DA CLASSE */

    // CONSTRUTOR DA CLASSE
    public Entrada(K key, V value) {
        this.key = key;
        this.value = value;
        this.proximo = null;
    }
}