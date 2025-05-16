package PratoPronto.back.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import PratoPronto.back.model.Cozinheiro;
import PratoPronto.back.repository.CozinheiroRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CozinheiroService {

    @Autowired
    private CozinheiroRepository cozinheiroRepository;

    public List<Cozinheiro> listarTodos() {
        return cozinheiroRepository.findAll();
    }

    public Optional<Cozinheiro> buscarPorId(Long id) {
        return cozinheiroRepository.findById(id);
    }

    public Cozinheiro salvar(Cozinheiro cozinheiro) {
        return cozinheiroRepository.save(cozinheiro);
    }

    public void deletar(Long id) {
        cozinheiroRepository.deleteById(id);
    }
}
