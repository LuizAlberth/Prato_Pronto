package PratoPronto.back.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

import PratoPronto.back.model.Upload;
import PratoPronto.back.service.UploadService;

@RestController
@RequestMapping("/uploads")
public class UploadController {

    @Autowired
    private UploadService uploadService;

    @GetMapping
    public List<Upload> getAll() {
        return uploadService.listarTodos();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Upload create(@Valid @RequestBody Upload upload) {
        return uploadService.salvar(upload);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        uploadService.deletar(id);
    }
}
