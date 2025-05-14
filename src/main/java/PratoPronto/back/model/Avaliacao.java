package PratoPronto.back.model;

public class Avaliacao {
    private int id;
    private int nota;
    private String comentario;
    private Usuario usuario; // Usuário que fez a avaliação
    private Receita receita; // Receita que foi avaliada

    public Avaliacao(int id, int nota, String comentario, Usuario usuario, Receita receita) {
        this.id = id;
        this.nota = nota;
        this.comentario = comentario;
        this.usuario = usuario;
        this.receita = receita;
    }

    // Getters
    public int getId() {
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
    public void setId(int id) {
        this.id = id;
    }

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