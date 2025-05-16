package PratoPronto.back.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import PratoPronto.back.model.Receita;
import PratoPronto.back.repository.ReceitaRepository;

@Service
public class ReceitaService {

    @Autowired
    private ReceitaRepository receitaRepository;

    public List<Receita> listarTodas() {
        return receitaRepository.findAll();
    }

    public Optional<Receita> buscarPorId(Long id) {
        return receitaRepository.findById(id);
    }

    public Receita salvar(Receita receita) {
        return receitaRepository.save(receita);
    }

    public void deletar(Long id) {
        receitaRepository.deleteById(id);
    }

    public List<Receita> buscarPorTitulo(String titulo) {
        return receitaRepository.findByTituloContaining(titulo);
    }
}
