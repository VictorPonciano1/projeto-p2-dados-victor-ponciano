public class Usuario {

    /* ATRIBUTOS DA CLASSE */

    // MATRICULA DO USUARIO
    private int matricula;

    // NOME COMPLETO DO USUARIO
    private String nome;

    // EMAIL DO USUARIO
    private String email;

    /* METODOS DA CLASSE */

    // CONSTRUTOR DA CLASSE
    public Usuario(int matricula, String nome, String email) {
        this.matricula = matricula;
        this.nome = nome;
        this.email = email;
    }

    // RETORNA A MATRICULA DO USUARIO
    public int getMatricula() {
        return matricula;
    }

    // RETORNA O NOME DO USUARIO
    public String getNome() {
        return nome;
    }

    // RETORNA O EMAIL DO USUARIO
    public String getEmail() {
        return email;
    }

    // ALTERA O EMAIL DO USUARIO
    public void setEmail(String email) {
        this.email = email;
    }

    // RETORNA UMA REPRESENTACAO TEXTUAL DO USUARIO
    @Override
    public String toString() {
        return "Matricula: " + matricula
                + " | Nome: " + nome
                + " | Email: " + email;
    }

    // COMPARA DOIS USUARIOS PELA MATRICULA
    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Usuario outro = (Usuario) obj;

        return this.matricula == outro.matricula;
    }
}
