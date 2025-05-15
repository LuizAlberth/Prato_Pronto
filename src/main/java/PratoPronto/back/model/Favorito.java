package PratoPronto.back.model;

import jakarta.persistence.*;

@Entity
public class Favorito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Usuario usuario;

    @ManyToOne
    private Receita receita;

    public Favorito() {}

    public Favorito(Usuario usuario, Receita receita) {
        this.usuario = usuario;
        this.receita = receita;
    }


    // Getters
    public long getId() {
        return id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Receita getReceita() {
        return receita;
    }

    // Setters

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setReceita(Receita receita) {
        this.receita = receita;
    }
}
