package PratoPronto.back.model;

public class Upload {
    private int id;
    private String caminhoArquivo;
    private Receita receita; // Referência à Receita à qual este upload pertence

    public Upload(int id, String caminhoArquivo, Receita receita) {
        this.id = id;
        this.caminhoArquivo = caminhoArquivo;
        this.receita = receita;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getCaminhoArquivo() {
        return caminhoArquivo;
    }

    public Receita getReceita() {
        return receita;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setCaminhoArquivo(String caminhoArquivo) {
        this.caminhoArquivo = caminhoArquivo;
    }
}
