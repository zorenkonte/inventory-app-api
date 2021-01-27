package com.darkmode.inventory_app.repository;

import com.darkmode.inventory_app.model.Media;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MediaRepository extends JpaRepository<Media, Long> {
}
