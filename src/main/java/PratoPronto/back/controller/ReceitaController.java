package PratoPronto.back.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import PratoPronto.back.model.Receita;
import PratoPronto.back.service.ReceitaService;

@RestController
@RequestMapping("/receitas")
public class ReceitaController {
    @Autowired
    private ReceitaService receitaService;

    @GetMapping
    public List<Receita> getAll() {
        return receitaService.listarTodas();
    }

    @GetMapping("/{id}")
    public Optional<Receita> getById(@PathVariable Long id) {
        return receitaService.buscarPorId(id);
    }

    @PostMapping
    public Receita create(@RequestBody Receita receita) {
        return receitaService.salvar(receita);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        receitaService.deletar(id);
    }
}
