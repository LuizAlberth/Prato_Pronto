package PratoPronto.back.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import PratoPronto.back.model.Comum;
import PratoPronto.back.repository.ComumRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ComumService {

    @Autowired
    private ComumRepository comumRepository;

    public List<Comum> listarTodos() {
        return comumRepository.findAll();
    }

    public Optional<Comum> buscarPorId(Long id) {
        return comumRepository.findById(id);
    }

    public Comum salvar(Comum comum) {
        return comumRepository.save(comum);
    }

    public void deletar(Long id) {
        comumRepository.deleteById(id);
    }
}
