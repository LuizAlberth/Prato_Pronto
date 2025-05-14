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

    public Optional<Receita> buscarPorId(Integer id) {
        return receitaRepository.findById(id);
    }

    public Receita salvar(Receita receita) {
        return receitaRepository.save(receita);
    }

    public void deletar(Integer id) {
        receitaRepository.deleteById(id);
    }
}
