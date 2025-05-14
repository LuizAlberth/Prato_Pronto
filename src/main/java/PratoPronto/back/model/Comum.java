package PratoPronto.back.model;

public class Comum extends Usuario {

    public Comum(int id, String nome, String email, String senha) {
        super(id, nome, email, senha);
    }

    @Override
    public void buscarReceitaPorIngrediente() {
        System.out.println("Usuário Comum buscando receitas por ingrediente...");
        // Implementação específica para buscar receitas por ingrediente para usuário comum
    }

    @Override
    public void avaliarReceita() {
        System.out.println("Usuário Comum avaliando uma receita...");
        // Implementação específica para avaliar receitas para usuário comum
    }

    public void salvarReceitaFavorita() {
        System.out.println("Usuário Comum salvou uma receita como favorita.");
        // Lógica para salvar uma receita como favorita para este usuário
    }
}
