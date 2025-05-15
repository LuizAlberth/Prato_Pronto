package PratoPronto.back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import PratoPronto.back.model.Avaliacao;
import PratoPronto.back.repository.AvaliacaoRepository;

@Service
public class AvaliacaoService {

    @Autowired
    private AvaliacaoRepository avaliacaoRepository;

    public List<Avaliacao> listarTodas() {
        return avaliacaoRepository.findAll();
    }
    

    public Avaliacao salvar(Avaliacao avaliacao) {
        return avaliacaoRepository.save(avaliacao);
    }

    public void deletar(Long id) {
        avaliacaoRepository.deleteById(id);
    }
}
