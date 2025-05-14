package PratoPronto.back.model;

public abstract class Usuario {
    protected int id;
    protected String nome;
    protected String email;
    protected String senha;

    public Usuario(int id, String nome, String email, String senha) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    // Métodos abstratos (conforme o diagrama)
    public abstract void buscarReceitaPorIngrediente();

    public abstract void avaliarReceita();

    // Um método concreto que subclasses podem usar ou sobrescrever
    public void exibirInformacoes() {
        System.out.println("ID: " + this.id);
        System.out.println("Nome: " + this.nome);
        System.out.println("Email: " + this.email);
    }
}
