package PratoPronto.back.controller;

import java.util.List;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import PratoPronto.back.model.Favorito;
import PratoPronto.back.service.FavoritoService;

@RestController
@RequestMapping("/favoritos")
public class FavoritoController {

    @Autowired
    private FavoritoService favoritoService;

    @GetMapping
    public List<Favorito> getAll() {
        return favoritoService.listarTodos();
    }

    @PostMapping
    public ResponseEntity<Favorito> create(@RequestBody @Valid Favorito favorito) {
        Favorito salvo = favoritoService.salvar(favorito);
        return ResponseEntity.status(201).body(salvo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        favoritoService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
