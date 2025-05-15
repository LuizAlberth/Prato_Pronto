package PratoPronto.back.model;

import jakarta.persistence.Entity;

@Entity
public class Comum extends Usuario {

    public Comum() {
        // Construtor padrão exigido pelo JPA
    }

    public Comum(String nome, String email, String senha) {
        super(nome, email, senha);
    }

    @Override
    public void buscarReceitaPorIngrediente() {
        // Implementação específica
    }

    @Override
    public void avaliarReceita() {
        // Implementação específica
    }

    public void salvarReceitaFavorita() {
        // Lógica para salvar receita favorita
    }
}
