package PratoPronto.back.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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
    public Favorito create(@RequestBody Favorito favorito) {
        return favoritoService.salvar(favorito);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        favoritoService.deletar(id);
    }
}
