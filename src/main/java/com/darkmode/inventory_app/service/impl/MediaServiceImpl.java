package com.darkmode.inventory_app.service.impl;

import com.darkmode.inventory_app.dao.MediaDao;
import com.darkmode.inventory_app.model.Media;
import com.darkmode.inventory_app.service.MediaService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MediaServiceImpl implements MediaService {
    private final MediaDao mediaDao;

    @Override
    public Page<Media> list(Pageable pageable) {
        return mediaDao.findAll(pageable);
    }
}
