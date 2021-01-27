package com.darkmode.inventory_app.service;

import com.darkmode.inventory_app.model.Media;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface MediaService {
    Page<Media> list(Pageable pageable);
}
