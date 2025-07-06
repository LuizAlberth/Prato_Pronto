package PratoPronto.back.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import PratoPronto.back.model.Receita;
import PratoPronto.back.service.ReceitaService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/receitas")
@Validated
public class ReceitaController {

    @Autowired
    private ReceitaService receitaService;

    @GetMapping
    public List<Receita> getAll() {
        return receitaService.listarTodas();
    }

    @GetMapping("/{id}")
    public Optional<Receita> getById(@PathVariable Long id) {
        return receitaService.getReceitaPorId(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Receita create(@Valid @RequestBody Receita receita) {
        return receitaService.salvar(receita);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        receitaService.deletar(id);
    }
}
