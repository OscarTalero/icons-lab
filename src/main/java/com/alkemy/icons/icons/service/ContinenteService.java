package com.alkemy.icons.icons.service;

import com.alkemy.icons.icons.dto.ContinenteDTO;
import com.alkemy.icons.icons.entity.ContinenteEntity;

import java.util.List;

public interface ContinenteService {

    ContinenteDTO save(ContinenteDTO dto);
    List<ContinenteDTO> getAllContinentes();
    void delete(Long id);
    ContinenteDTO update(Long id, ContinenteDTO continente);
}
