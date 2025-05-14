package PratoPronto.back.model;

public class Favorito {
    private int id;
    private Usuario usuario; // Usuário que adicionou a receita aos favoritos
    private Receita receita; // Receita que foi marcada como favorita

    public Favorito(int id, Usuario usuario, Receita receita) {
        this.id = id;
        this.usuario = usuario;
        this.receita = receita;
    }

    // Getters
    public int getId() {
        return id;
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

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setReceita(Receita receita) {
        this.receita = receita;
    }
}
