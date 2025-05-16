package PratoPronto.back.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import PratoPronto.back.model.Comum;
import PratoPronto.back.service.ComumService;

import java.util.List;

@RestController
@RequestMapping("/comuns")
public class ComumController {

    @Autowired
    private ComumService comumService;

    @GetMapping
    public List<Comum> getAll() {
        return comumService.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Comum> getById(@PathVariable Long id) {
        return comumService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Comum> create(@RequestBody @Valid Comum comum) {
        Comum salvo = comumService.salvar(comum);
        return ResponseEntity.ok(salvo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        comumService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
