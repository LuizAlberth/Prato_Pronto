package PratoPronto.back.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

import PratoPronto.back.model.Favorito;
import PratoPronto.back.model.Usuario;
import PratoPronto.back.model.Receita;

@Repository
public interface FavoritoRepository extends JpaRepository<Favorito, Long> {
    Optional<Favorito> findByUsuarioAndReceita(Usuario usuario, Receita receita);
}
