public class FilaVaziaException extends RuntimeException {

    // EXCECAO PARA QUANDO A FILA ESTIVER VAZIA
    public FilaVaziaException() {
        super("A fila esta vazia!");
    }
    
}
