package PratoPronto.back.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import PratoPronto.back.model.Comum;
import PratoPronto.back.repository.ComumRepository;

@Service
public class ComumService {

    @Autowired
    private ComumRepository comumRepository;

  
    @Autowired
    private PasswordEncoder passwordEncoder;

 

  
    public Comum salvar(Comum comum) {
        // Codifica a senha antes de salvar o objeto no banco de dados
        String senhaCodificada = passwordEncoder.encode(comum.getSenha());
        comum.setSenha(senhaCodificada);
        return comumRepository.save(comum);
    }

    public List<Comum> listarTodos() {
        return comumRepository.findAll();
    }

    public Optional<Comum> buscarPorId(Long id) {
        return comumRepository.findById(id);
    }

    public void deletar(Long id) {
        comumRepository.deleteById(id);
    }
}
