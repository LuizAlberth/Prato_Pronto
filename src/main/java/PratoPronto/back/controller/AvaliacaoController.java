package PratoPronto.back.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import PratoPronto.back.model.Avaliacao;
import PratoPronto.back.service.AvaliacaoService;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoController {
    @Autowired
    private AvaliacaoService avaliacaoService;

    @GetMapping
    public List<Avaliacao> getAll() {
        return avaliacaoService.listarTodas();
    }

    @PostMapping
    public Avaliacao create(@RequestBody Avaliacao avaliacao) {
        return avaliacaoService.salvar(avaliacao);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        avaliacaoService.deletar(id);
    }
}
