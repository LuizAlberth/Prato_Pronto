package PratoPronto.back.model;

public class Cozinheiro extends Usuario {

    private boolean verificado;

    public Cozinheiro(int id, String nome, String email, String senha, boolean verificado) {
        super(id, nome, email, senha);
        this.verificado = verificado;
    }

    // Getter para o atributo 'verificado'
    public boolean isVerificado() {
        return verificado;
    }

    // Setter para o atributo 'verificado'
    public void setVerificado(boolean verificado) {
        this.verificado = verificado;
    }

    @Override
    public void buscarReceitaPorIngrediente() {
        System.out.println("Cozinheiro buscando receitas por ingrediente...");
        // Implementação específica para buscar receitas por ingrediente para cozinheiro
    }

    @Override
    public void avaliarReceita() {
        System.out.println("Cozinheiro avaliando uma receita...");
        // Implementação específica para avaliar receitas para cozinheiro
    }

    public void criarReceita() {
        System.out.println("Cozinheiro criou uma nova receita.");
        // Lógica para criar uma nova receita
    }

    public void editarReceita() {
        System.out.println("Cozinheiro editou uma receita existente.");
        // Lógica para editar uma receita
    }

    public void deletarReceita() {
        System.out.println("Cozinheiro deletou uma receita.");
        // Lógica para deletar uma receita
    }

    public void fazerUpload() {
        System.out.println("Cozinheiro fez um upload (de uma imagem, por exemplo).");
        // Lógica para realizar um upload
    }

    public void visualizarReceitas() {
        System.out.println("Cozinheiro está visualizando suas receitas.");
        // Lógica para visualizar as receitas do cozinheiro
    }

}