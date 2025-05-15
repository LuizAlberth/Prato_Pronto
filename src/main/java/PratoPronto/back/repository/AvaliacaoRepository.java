package PratoPronto.back.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import PratoPronto.back.model.Avaliacao;
import PratoPronto.back.model.Receita;

@Repository
public interface AvaliacaoRepository extends JpaRepository<Avaliacao, Long> {
    List<Avaliacao> findByReceita(Receita receita);
}
