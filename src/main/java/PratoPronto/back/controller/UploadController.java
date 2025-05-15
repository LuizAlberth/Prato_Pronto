package PratoPronto.back.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public Upload create(@RequestBody Upload upload) {
        return uploadService.salvar(upload);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        uploadService.deletar(id);
    }
}
