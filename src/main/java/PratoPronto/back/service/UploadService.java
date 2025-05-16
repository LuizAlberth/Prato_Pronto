package PratoPronto.back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import PratoPronto.back.model.Upload;
import PratoPronto.back.repository.UploadRepository;

import java.util.NoSuchElementException;

@Service
public class UploadService {

    @Autowired
    private UploadRepository uploadRepository;

    public List<Upload> listarTodos() {
        return uploadRepository.findAll();
    }

    public Upload salvar(Upload upload) {
        return uploadRepository.save(upload);
    }

    public void deletar(Long id) {
        if (!uploadRepository.existsById(id)) {
            throw new NoSuchElementException("Upload com id " + id + " não encontrado.");
        }
        uploadRepository.deleteById(id);
    }
}