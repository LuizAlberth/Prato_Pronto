package PratoPronto.back.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
public class Avaliacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Min(value = 1, message = "Nota mínima é 1")
    @Max(value = 5, message = "Nota máxima é 5")
    private int nota;

    @Size(max = 500, message = "Comentário pode ter até 500 caracteres")
    private String comentario;

    @ManyToOne
    @NotNull(message = "Usuário é obrigatório")
    private Usuario usuario;

    @ManyToOne
    @NotNull(message = "Receita é obrigatória")
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