package PratoPronto.back.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import PratoPronto.back.model.Ingrediente;
import PratoPronto.back.repository.IngredienteRepository;

@Service
public class IngredienteService {

    @Autowired
    private IngredienteRepository ingredienteRepository;

    public List<Ingrediente> listarTodos() {
        return ingredienteRepository.findAll();
    }

    public Optional<Ingrediente> buscarPorId(Long id) {
        return ingredienteRepository.findById(id);
    }

    public Ingrediente salvar(Ingrediente ingrediente) {
        return ingredienteRepository.save(ingrediente);
    }

     public void deletar(Long id) {
        ingredienteRepository.deleteById(id);
    }
}
