// public class GestorEmprestimos {
    
//     /* ATRIBUTOS DA CLASSE */

//     // FILAS DE ESPERA INDEXADAS PELO ISBN
//     private NossoHash<String, Fila<Usuario>> filasEspera;

//     /* METODOS DA CLASSE */

//     // CONSTRUTOR DA CLASSE
//     public GestorEmprestimos() {
//         this.filasEspera = new NossoHash<>();
//     }

//     // EMPRESTIMO DE UM LIVRO
//     public void solicitarEmprestimo(String isbn, Usuario usuario) {
//         Fila<Usuario> fila = filasEspera.get(isbn);
//         if (fila == null) {
//             fila = new Fila<>();
//             filasEspera.put(isbn, fila);
//         }
//         fila.enfileira(usuario);
//         System.out.println("Usuario " + usuario.getNome() + " solicitou emprestimo do livro com ISBN " + isbn);
//     }

//     // DEVOLVE LIVRO E ATUALIZA FILA DE ESPERA
//     public void devolverLivro(String isbn) {
//         Fila<Usuario> fila = filasEspera.get(isbn);
//         if (fila == null || fila.filaVazia()) {
//             System.out.println("Nao ha usuarios na fila de espera para o livro com ISBN " + isbn);
//             return;
//         } 
//         Usuario proximoUsuario = fila.desenfileira();
//         System.out.println("Livro " + isbn + " emprestado automaticamente para o usuario " + proximoUsuario.getNome());
//     }

//     // EXIBE A FILA DE ESPERA DE UM LIVRO
//     public void listarFilaEspera(String isbn) {
//         Fila<Usuario> fila = filasEspera.get(isbn);
//         if (fila == null || fila.filaVazia()) {
//             System.out.println("Nao ha usuarios na fila de espera para o livro com ISBN " + isbn);
//             return;
//         }
//         System.out.println(fila);
//     }

// }
