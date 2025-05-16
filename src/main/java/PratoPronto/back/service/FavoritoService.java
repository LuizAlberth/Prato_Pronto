package PratoPronto.back.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import PratoPronto.back.model.Favorito;
import PratoPronto.back.repository.FavoritoRepository;

@Service
public class FavoritoService {

    @Autowired
    private FavoritoRepository favoritoRepository;

    public List<Favorito> listarTodos() {
        return favoritoRepository.findAll();
    }

    public Favorito salvar(Favorito favorito) {
        Optional<Favorito> existente = favoritoRepository.findByUsuarioAndReceita(
                favorito.getUsuario(), favorito.getReceita());

        if (existente.isPresent()) {
            throw new IllegalArgumentException("Esta receita já está nos favoritos do usuário.");
        }

        return favoritoRepository.save(favorito);
    }

    public void deletar(Long id) {
        favoritoRepository.deleteById(id);
    }
}
