package PratoPronto.back.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import PratoPronto.back.model.Cozinheiro;

public interface CozinheiroRepository extends JpaRepository<Cozinheiro, Long> {
}
