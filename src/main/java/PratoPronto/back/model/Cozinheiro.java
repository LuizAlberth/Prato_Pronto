package PratoPronto.back.model;

import jakarta.persistence.Entity;

@Entity
public class Cozinheiro extends Usuario {

    private boolean verificado;

    public Cozinheiro() {
        // Construtor padrão exigido pelo JPA
    }

    public Cozinheiro(String nome, String email, String senha, boolean verificado) {
        super(nome, email, senha);
        this.verificado = verificado;
    }

    public boolean isVerificado() {
        return verificado;
    }

    public void setVerificado(boolean verificado) {
        this.verificado = verificado;
    }

    @Override
    public void buscarReceitaPorIngrediente() {
        // Implementação específica
    }

    @Override
    public void avaliarReceita() {
        // Implementação específica
    }

    public void criarReceita() {
        // Lógica para criar uma receita
    }

    public void editarReceita() {
        // Lógica para editar receita
    }

    public void deletarReceita() {
        // Lógica para deletar receita
    }

    public void fazerUpload() {
        // Lógica para fazer upload
    }

    public void visualizarReceitas() {
        // Lógica para visualizar receitas
    }
}