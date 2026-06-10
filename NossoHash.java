public class NossoHash<K, V> {

    /* ATRIBUTOS DA CLASSE */

    // ARRAY INTERNO DA TABELA HASH
    private Entrada<K, V>[] tabela;
    // CAPACIDADE DA TABELA
    private int capacidade;

    /* METODOS DA CLASSE */

    // CONSTRUTOR DA CLASSE
    @SuppressWarnings("unchecked")
    public NossoHash() {
        this.capacidade = 16;
        this.tabela = (Entrada<K, V>[]) new Entrada[capacidade];
    }

    // CALCULA A POSICAO DA CHAVE NA TABELA
    private int hash(K key) {
        return Math.abs(key.hashCode()) % capacidade;
    }

    // INSERE UMA NOVA ENTRADA NA TABELA HASH
    public void put(K key, V value) {
        int posicao = hash(key);
        Entrada<K, V> novaEntrada = new Entrada<>(key, value);
        novaEntrada.proximo = tabela[posicao];
        tabela[posicao] = novaEntrada;
    }

    // RETORNA O VALOR ASSOCIADO A CHAVE
    public V get(K key) {
        int posicao = hash(key);
        Entrada<K, V> atual = tabela[posicao];
        while (atual != null) {
            if (atual.key.equals(key)) {
                return atual.value;
            }
            atual = atual.proximo;
        }
        return null;
    }

    // VERIFICA SE A CHAVE EXISTE NA TABELA
    public boolean containsKey(K key) {
        return get(key) != null;
    }

    // VERIFICA SE O VALOR EXISTE NA TABELA
    public boolean containsValue(V value) {
        for (int i = 0; i < capacidade; i++) {
            Entrada<K, V> atual = tabela[i];
            while (atual != null) {
                if (atual.value.equals(value)) {
                return true;
                }
            atual = atual.proximo;
            }
        }
        return false;
    }

    // EXIBE O CONTEUDO DA TABELA HASH
    public void exibeMap() {
        for (int i = 0; i < capacidade; i++) {
            System.out.print("[" + i + "] -> ");
            Entrada<K, V> atual = tabela[i];
            while (atual != null) {
                System.out.print("(" + atual.key +", " + atual.value + ") -> ");
                atual = atual.proximo;
            }
            System.out.println("null");
        }
    }

}