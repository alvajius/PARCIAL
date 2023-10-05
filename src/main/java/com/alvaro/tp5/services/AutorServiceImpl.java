package com.alvaro.tp5.services;

import com.alvaro.tp5.entities.Autor;
import com.alvaro.tp5.repositories.AutorRepository;
import com.alvaro.tp5.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl <Autor, Long> implements AutorService {
@Autowired
private AutorRepository autorRepository;

public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository, AutorRepository autorRepository) {
        super(baseRepository);
        this.autorRepository = autorRepository;
        }
}
