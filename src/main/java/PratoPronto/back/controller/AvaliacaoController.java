package PratoPronto.back.controller;

import jakarta.validation.Valid;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<Avaliacao> create(@RequestBody @Valid Avaliacao avaliacao) {
        Avaliacao salvo = avaliacaoService.salvar(avaliacao);
        return ResponseEntity.ok(salvo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        avaliacaoService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}