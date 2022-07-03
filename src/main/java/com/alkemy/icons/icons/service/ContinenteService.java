package com.alkemy.icons.icons.service;

import com.alkemy.icons.icons.dto.ContinenteDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContinenteService {


    public ContinenteDTO save(ContinenteDTO dto){
        // TODO: guardar continente
        System.out.println("Continente guardado");
        return dto;
    }
}
