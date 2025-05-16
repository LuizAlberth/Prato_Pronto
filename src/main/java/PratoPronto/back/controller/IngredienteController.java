package PratoPronto.back.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import PratoPronto.back.model.Ingrediente;
import PratoPronto.back.service.IngredienteService;

import jakarta.validation.Valid;

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
    public Optional<Ingrediente> getById(@PathVariable Long id) {
        return ingredienteService.buscarPorId(id);
    }

    @PostMapping
    public Ingrediente create(@Valid @RequestBody Ingrediente ingrediente) {
        return ingredienteService.salvar(ingrediente);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        ingredienteService.deletar(id);
    }
}
