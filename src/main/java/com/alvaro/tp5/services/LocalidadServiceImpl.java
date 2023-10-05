package com.alvaro.tp5.services;

import com.alvaro.tp5.entities.Localidad;
import com.alvaro.tp5.repositories.BaseRepository;
import com.alvaro.tp5.repositories.LocalidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl <Localidad, Long> implements LocalidadService{
    @Autowired
    private LocalidadRepository localidadRepository;
    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository, LocalidadRepository localidadRepository) {
        super(baseRepository);
        this.localidadRepository = localidadRepository;

    }
}
