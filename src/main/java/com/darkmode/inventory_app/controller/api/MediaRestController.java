package com.darkmode.inventory_app.controller.api;

import com.darkmode.inventory_app.annotation.CustomRestController;
import com.darkmode.inventory_app.model.Media;
import com.darkmode.inventory_app.service.MediaService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@CustomRestController("/media")
public class MediaRestController {
    private final MediaService mediaService;

    @GetMapping
    public ResponseEntity<Page<Media>> list(Pageable pageable) {
        return ResponseEntity.ok(mediaService.list(pageable));
    }
}
