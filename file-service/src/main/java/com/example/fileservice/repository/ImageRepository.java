package com.example.fileservice.repository;

import com.example.fileservice.entity.ImageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import java.util.Optional;
import java.util.List;
@Repository
public interface ImageRepository extends JpaRepository<ImageEntity,Long> {
    Optional<ImageEntity> findByUuid(String uuid);
    @Query(nativeQuery = true, value = "SELECT * FROM image_data where createat < current_date - interval '2 days' and isused = false")
    List<ImageEntity> findDontUseImages();

}
