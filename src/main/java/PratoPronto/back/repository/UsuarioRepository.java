package PratoPronto.back.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import PratoPronto.back.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
   
    Usuario findByEmail(String email);
}
