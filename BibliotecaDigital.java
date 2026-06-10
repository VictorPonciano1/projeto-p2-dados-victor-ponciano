import java.util.Scanner;

public class BibliotecaDigital {
    
    /* ATRIBUTOS DA CLASSE */

    // CATALOGO INDEXADO PELO ISBN
    private Catalogo catalogo;
    // ACERVO DA BIBLIOTECA
    private ListaDupla acervo;
    // GESTOR DE EMPRESTIMOS
    private GestorEmprestimos gestor;

    /* METODOS DA CLASSE */
    
    // CONSTRUTOR
    public BibliotecaDigital() {
        this.catalogo = new Catalogo();
        this.acervo = new ListaDupla();
        this.gestor = new GestorEmprestimos();
    }

    // MENU PRINCIPAL
    public void exibirMenu() {
        System.out.println("\n===== BIBLIOTECA DIGITAL =====");
        System.out.println("1 - Cadastrar livro");
        System.out.println("2 - Buscar livro por ISBN");
        System.out.println("3 - Listar acervo do inicio ao fim");
        System.out.println("4 - Listar acervo do fim ao inicio");
        System.out.println("5 - Solicitar emprestimo");
        System.out.println("6 - Devolver livro");
        System.out.println("7 - Ver fila de espera");
        System.out.println("0 - Sair");
        System.out.print("Opcao: ");
    }

    // METODO PRINCIPAL PARA TESTAR/EXECUTAR A BIBLIOTECA
    public static void main(String[] args) {
        
        BibliotecaDigital biblioteca = new BibliotecaDigital();

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            biblioteca.exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); // LIMPA O BUFFER
            switch (opcao) {
                case 1:
                    System.out.print("Digite o ISBN do livro: ");
                    String isbn = scanner.nextLine();
                    System.out.print("Digite o titulo do livro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Digite o autor do livro: ");
                    String autor = scanner.nextLine();
                    System.out.print("Digite o ano de publicacao do livro: ");
                    int ano = scanner.nextInt();

                    scanner.nextLine(); // LIMPA O BUFFER

                    Livro livro = new Livro(isbn, titulo, autor, ano);
                    biblioteca.catalogo.cadastrar(livro);
                    biblioteca.acervo.insereFim(livro);
                    System.out.println("Livro cadastrado com sucesso!");
                break;
                case 2:
                    System.out.print("Digite o ISBN do livro para buscar: ");
                    String isbnBusca = scanner.nextLine();
                    Livro livroEncontrado = biblioteca.catalogo.buscar(isbnBusca);

                    if (livroEncontrado != null) {
                        System.out.println("Livro encontrado: " + livroEncontrado);
                    } else {
                        System.out.println("Livro com ISBN " + isbnBusca + " nao encontrado.");
                    }
                break;
                case 3:
                    System.out.println("Acervo do Inicio ao Fim:");
                    biblioteca.acervo.listarDoInicio();
                break;
                case 4:
                    System.out.println("Acervo do Fim ao Inicio:");
                    biblioteca.acervo.listarDoFim();
                break;
                case 5:
                    System.out.print("Digite o ISBN do livro para solicitar emprestimo: ");
                    String isbnEmprestimo = scanner.nextLine();
                    System.out.print("Digite o RA do usuario solicitante: ");
                    String raUsuario = scanner.nextLine();
                    System.out.print("Digite o nome do usuario solicitante: ");
                    String nomeUsuario = scanner.nextLine();
                    System.out.print("Digite o email do usuario solicitante: ");
                    String emailUsuario = scanner.nextLine();

                    scanner.nextLine(); // LIMPA O BUFFER

                    Usuario usuario = new Usuario(raUsuario, nomeUsuario, emailUsuario);
                    biblioteca.gestor.solicitarEmprestimo(isbnEmprestimo, usuario);
                break;
                case 6:
                    System.out.print("Digite o ISBN do livro para devolver: ");
                    String isbnDevolucao = scanner.nextLine();
                    biblioteca.gestor.devolverLivro(isbnDevolucao);
                break;
                case 7:
                    System.out.print("Digite o ISBN do livro para ver a fila de espera: ");
                    String isbnFila = scanner.nextLine();
                    biblioteca.gestor.listarFilaDeEspera(isbnFila);
                break;
                case 0:
                    System.out.println("Encerrando a biblioteca digital. Obrigado por usar!");
                break;
                default:
                    System.out.println("Opcao invalida. Tente novamente.");
            } 
        } while (opcao != 0);

        scanner.close();
    }

}
