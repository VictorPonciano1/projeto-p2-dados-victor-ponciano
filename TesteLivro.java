public class TesteLivro {

    public static void main(String[] args) {

        Livro l1 = new Livro(
                "978-85-430-0067-8",
                "Estruturas de Dados",
                "Goodrich",
                2013);

        Livro l2 = new Livro(
                "978-85-430-0067-8",
                "Outro Titulo",
                "Outro Autor",
                2020);

        System.out.println(l1);

        System.out.println("São iguais? " + l1.equals(l2));
    }
}