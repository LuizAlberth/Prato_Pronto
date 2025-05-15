package PratoPronto.back.model;

import jakarta.persistence.*;

@Entity
public class Ingrediente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String quantidade;

    public Ingrediente() {}

    public Ingrediente(String nome, String quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    // Getters
    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getQuantidade() {
        return quantidade;
    }

    // Setters

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }
}
