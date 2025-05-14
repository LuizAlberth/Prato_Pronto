package PratoPronto.back.service;

import java.util.List;

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
        return favoritoRepository.save(favorito);
    }

    public void deletar(Integer id) {
        favoritoRepository.deleteById(id);
    }
}
