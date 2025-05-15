package PratoPronto.back.model;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class Receita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String descricao;
    private String modoPreparo;
    private int tempoPreparo;
    private String dificuldade;

    @ManyToOne
    private Cozinheiro idCozinheiro;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Ingrediente> ingredientes;

    @OneToMany(mappedBy = "receita", cascade = CascadeType.ALL)
    private List<Upload> uploads;

    public Receita() {}

    public Receita(String titulo, String descricao, String modoPreparo, int tempoPreparo, Cozinheiro idCozinheiro,
                   List<Ingrediente> ingredientes, List<Upload> uploads, String dificuldade) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.modoPreparo = modoPreparo;
        this.tempoPreparo = tempoPreparo;
        this.idCozinheiro = idCozinheiro;
        this.ingredientes = ingredientes;
        this.uploads = uploads;
        this.dificuldade = dificuldade;
    }

    // Getters
    public long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getModoPreparo() {
        return modoPreparo;
    }

    public int getTempoPreparo() {
        return tempoPreparo;
    }

    public Usuario getIdCozinheiro() {
        return idCozinheiro;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public List<Upload> getUploads() {
        return uploads;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    // Setters


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setModoPreparo(String modoPreparo) {
        this.modoPreparo = modoPreparo;
    }

    public void setTempoPreparo(int tempoPreparo) {
        this.tempoPreparo = tempoPreparo;
    }

    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void setUploads(List<Upload> uploads) {
        this.uploads = uploads;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

}
