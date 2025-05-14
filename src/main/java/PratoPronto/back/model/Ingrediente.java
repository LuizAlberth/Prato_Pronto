package PratoPronto.back.model;

public class Ingrediente {
    private int id;
    private String nome;
    private String quantidade; // Adicionando a quantidade do ingrediente

    public Ingrediente(int id, String nome, String quantidade) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getQuantidade() {
        return quantidade;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }
}
