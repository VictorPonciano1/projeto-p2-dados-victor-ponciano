public class TesteEtapa1 {

    public static void main(String[] args) {

        ListaDupla acervo = new ListaDupla();

        Livro l1 = new Livro(
                "978-111",
                "Java Basico",
                "Autor A",
                2020);

        Livro l2 = new Livro(
                "978-222",
                "Estruturas de Dados",
                "Autor B",
                2021);

        Livro l3 = new Livro(
                "978-333",
                "Banco de Dados",
                "Autor C",
                2022);

        System.out.println("=== INSERINDO LIVROS ===");

        acervo.insereInicio(l1);
        acervo.insereFim(l2);
        acervo.insereFim(l3);

        System.out.println("\nTamanho da lista: " + acervo.getTamanho());

        System.out.println("\n=== LISTAGEM DO INICIO PARA O FIM ===");
        acervo.listarDoInicio();

        System.out.println("\n=== LISTAGEM DO FIM PARA O INICIO ===");
        acervo.listarDoFim();

        System.out.println("\n=== BUSCA POR ISBN ===");
        Livro encontrado = acervo.buscarPorIsbn("978-222");
        System.out.println(encontrado);

        System.out.println("\n=== REMOVENDO PRIMEIRO ===");
        System.out.println(acervo.removePrimeiro());

        System.out.println("\n=== REMOVENDO ULTIMO ===");
        System.out.println(acervo.removeUltimo());

        System.out.println("\n=== LISTA APOS REMOCOES ===");
        acervo.listarDoInicio();

        System.out.println("\nTamanho final: " + acervo.getTamanho());
    }
}