package PratoPronto.back.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import PratoPronto.back.model.Favorito;

@Repository
public interface FavoritoRepository extends JpaRepository<Favorito, Integer> {
    // Exemplo: verificar se uma receita está favoritada por um usuário
    // Optional<Favorito> findByUsuarioAndReceita(Usuario usuario, Receita receita);
}
