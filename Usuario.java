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

    // MATRICULA
    public int getMatricula() {
        return matricula;
    }

    // NOME
    public String getNome() {
        return nome;
    }

    // EMAIL
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    // TOSTRING PARA EXIBIR AS INFORMACOES DO USUARIO
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
