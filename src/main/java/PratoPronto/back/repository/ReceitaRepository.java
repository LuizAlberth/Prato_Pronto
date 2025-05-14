package PratoPronto.back.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import PratoPronto.back.model.Receita;

@Repository
public interface ReceitaRepository extends JpaRepository<Receita, Integer> {
    
    // List<Receita> findByTituloContaining(String titulo);
}
