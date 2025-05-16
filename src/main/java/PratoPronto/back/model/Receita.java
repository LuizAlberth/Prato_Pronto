package PratoPronto.back.model;

import java.util.List;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
public class Receita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O título é obrigatório.")
    @Size(max = 100, message = "O título deve ter no máximo 100 caracteres.")
    private String titulo;

    @NotBlank(message = "A descrição é obrigatória.")
    @Size(max = 500, message = "A descrição deve ter no máximo 500 caracteres.")
    private String descricao;

    @NotBlank(message = "O modo de preparo é obrigatório.")
    @Size(max = 1000, message = "O modo de preparo deve ter no máximo 1000 caracteres.")
    private String modoPreparo;

    @Min(value = 1, message = "O tempo de preparo deve ser maior que 0.")
    private int tempoPreparo;

    @NotBlank(message = "A dificuldade é obrigatória.")
    private String dificuldade;

    @ManyToOne
    @NotNull(message = "O cozinheiro responsável é obrigatório.")
    private Cozinheiro idCozinheiro;

    @OneToMany(cascade = CascadeType.ALL)
    @Size(min = 1, message = "A receita deve conter pelo menos um ingrediente.")
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
