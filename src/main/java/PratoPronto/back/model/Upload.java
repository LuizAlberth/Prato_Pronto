package PratoPronto.back.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
public class Upload {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O caminho do arquivo não pode estar em branco")
    private String caminhoArquivo;

    @ManyToOne
    @NotNull(message = "A receita associada não pode ser nula")
    private Receita receita;

    public Upload() {}

    public Upload(String caminhoArquivo, Receita receita) {
        this.caminhoArquivo = caminhoArquivo;
        this.receita = receita;
    }

    // Getters
    public long getId() {
        return id;
    }

    public String getCaminhoArquivo() {
        return caminhoArquivo;
    }

    public Receita getReceita() {
        return receita;
    }

    // Setters
    public void setCaminhoArquivo(String caminhoArquivo) {
        this.caminhoArquivo = caminhoArquivo;
    }

    public void setReceita(Receita receita) {
        this.receita = receita;
    }
}
