package PratoPronto.back.model;

import java.util.List;

public class Receita {
    private int id;
    private String titulo;
    private String descricao;
    private String modoPreparo;
    private int tempoPreparo;
    private Usuario idCozinheiro; // Referência ao Cozinheiro que criou a receita
    private List<Ingrediente> ingredientes;
    private List<Upload> uploads;
    private String dificuldade;

    public Receita(int id, String titulo, String descricao, String modoPreparo, int tempoPreparo,
                   Usuario idCozinheiro, List<Ingrediente> ingredientes, List<Upload> uploads, String dificuldade) {
        this.id = id;
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
    public int getId() {
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
    public void setId(int id) {
        this.id = id;
    }

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

    public void setIdCozinheiro(Usuario idCozinheiro) {
        this.idCozinheiro = idCozinheiro;
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
