package PratoPronto.back.model;

import jakarta.persistence.Entity;

@Entity
public class Comum extends Usuario {

    // Construtor padrão vazio é exigido pelo JPA.
    // O 'super()' chama o construtor da classe pai (Usuario).
    public Comum() {
        super();
    }

    // Este construtor recebe os dados e os repassa para a classe pai 'Usuario'
    // que é a responsável por armazená-los.
    public Comum(String nome, String email, String senha) {
        super(nome, email, senha);
    }

    // Os métodos que são específicos do usuário 'Comum' continuam aqui.
    @Override
    public void buscarReceitaPorIngrediente() {
        // Implementação específica futura
    }

    @Override
    public void avaliarReceita() {
        // Implementação específica futura
    }

    public void salvarReceitaFavorita() {
        // Lógica para salvar receita favorita
    }

    // NÃO PRECISAMOS DOS CAMPOS nem dos GETTERS/SETTERS para nome, email e senha,
    // pois eles já existem na classe 'Usuario' e são herdados automaticamente.
}