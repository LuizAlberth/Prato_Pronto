package PratoPronto.back.model;

import jakarta.persistence.*;

@Entity
public class Upload {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String caminhoArquivo;

    @ManyToOne
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
}
