package PratoPronto.back.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import PratoPronto.back.model.Cozinheiro;
import PratoPronto.back.service.CozinheiroService;

import java.util.List;

@RestController
@RequestMapping("/cozinheiros")
public class CozinheiroController {

    @Autowired
    private CozinheiroService cozinheiroService;

    @GetMapping
    public List<Cozinheiro> getAll() {
        return cozinheiroService.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cozinheiro> getById(@PathVariable Long id) {
        return cozinheiroService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Cozinheiro> create(@RequestBody @Valid Cozinheiro cozinheiro) {
        Cozinheiro salvo = cozinheiroService.salvar(cozinheiro);
        return ResponseEntity.ok(salvo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        cozinheiroService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
