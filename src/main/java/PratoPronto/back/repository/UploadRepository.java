package PratoPronto.back.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import PratoPronto.back.model.Upload;

@Repository
public interface UploadRepository extends JpaRepository<Upload, Long> {
}
