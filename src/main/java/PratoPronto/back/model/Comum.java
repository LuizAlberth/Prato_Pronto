package PratoPronto.back.model;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Comum extends Usuario {

    @NotBlank(message = "Nome é obrigatório")
    @Size(min = 2, max = 50, message = "Nome deve ter entre 2 e 50 caracteres")
    private String nome;

    @NotBlank(message = "Email é obrigatório")
    @Email(message = "Email deve ser válido")
    private String email;

    @NotBlank(message = "Senha é obrigatória")
    @Size(min = 6, message = "Senha deve ter ao menos 6 caracteres")
    private String senha;

    public Comum() {
        // Construtor padrão exigido pelo JPA
    }

    public Comum(String nome, String email, String senha) {
        super(nome, email, senha);
        this.nome = nome;
        this.email = email;
        this.senha = senha;
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

    // getters e setters para os novos campos, se quiser
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
