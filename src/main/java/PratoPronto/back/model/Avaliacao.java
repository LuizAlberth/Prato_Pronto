package PratoPronto.back.model;


import jakarta.persistence.*;

@Entity
public class Avaliacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int nota;
    private String comentario;

    @ManyToOne
    private Usuario usuario;

    @ManyToOne
    private Receita receita;

    public Avaliacao() {}

    public Avaliacao(int nota, String comentario, Usuario usuario, Receita receita) {

        this.nota = nota;
        this.comentario = comentario;
        this.usuario = usuario;
        this.receita = receita;
    }

    // Getters
    public long getId() {
        return id;
    }

    public int getNota() {
        return nota;
    }

    public String getComentario() {
        return comentario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Receita getReceita() {
        return receita;
    }

    // Setters

    public void setNota(int nota) {
        this.nota = nota;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setReceita(Receita receita) {
        this.receita = receita;
    }
}