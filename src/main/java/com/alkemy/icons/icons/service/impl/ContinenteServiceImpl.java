package com.alkemy.icons.icons.service.impl;

import com.alkemy.icons.icons.dto.ContinenteDTO;
import com.alkemy.icons.icons.entity.ContinenteEntity;
import com.alkemy.icons.icons.mapper.ContinenteMapper;
import com.alkemy.icons.icons.repository.ContinenteRepository;
import com.alkemy.icons.icons.service.ContinenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContinenteServiceImpl implements ContinenteService {

    @Autowired
    private ContinenteMapper continenteMapper;
    @Autowired
    private ContinenteRepository continenteRepository;

    public ContinenteDTO save(ContinenteDTO dto){
        ContinenteEntity entity = continenteMapper.continenteDTO2Entity(dto);
        ContinenteEntity entitySaved = continenteRepository.save(entity);
        ContinenteDTO result = continenteMapper.continenteEntity2DTO(entitySaved);
        return result;
    }

    public List<ContinenteDTO> getAllContinentes() {
        List<ContinenteEntity> entities = continenteRepository.findAll();
        List<ContinenteDTO> result = continenteMapper.continenteEntityList2DTOList(entities);
        return result;
    }

    public void delete(Long id) {
        continenteRepository.deleteById(id);
    }


    public ContinenteDTO update(Long id, ContinenteDTO dto){
        Optional<ContinenteEntity> entity = continenteRepository.findById(id);
        ContinenteEntity entityFind = entity.get();


        ContinenteEntity entityUpdated = continenteMapper.updateEntity(entityFind, dto);
        ContinenteEntity entitySaved = continenteRepository.save(entityUpdated);



        ContinenteDTO result = continenteMapper.continenteEntity2DTO(entitySaved);
        return result;
    }

}
