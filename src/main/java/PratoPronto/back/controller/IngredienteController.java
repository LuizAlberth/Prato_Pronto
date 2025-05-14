package PratoPronto.back.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import PratoPronto.back.model.Ingrediente;
import PratoPronto.back.service.IngredienteService;

@RestController
@RequestMapping("/ingredientes")
public class IngredienteController {
    @Autowired
    private IngredienteService ingredienteService;

    @GetMapping
    public List<Ingrediente> getAll() {
        return ingredienteService.listarTodos();
    }

    @GetMapping("/{id}")
    public Optional<Ingrediente> getById(@PathVariable int id) {
        return ingredienteService.buscarPorId(id);
    }

    @PostMapping
    public Ingrediente create(@RequestBody Ingrediente ingrediente) {
        return ingredienteService.salvar(ingrediente);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        ingredienteService.deletar(id);
    }
}
