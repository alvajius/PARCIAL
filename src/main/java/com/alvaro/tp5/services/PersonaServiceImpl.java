package com.alvaro.tp5.services;

import com.alvaro.tp5.entities.Persona;
import com.alvaro.tp5.repositories.BaseRepository;
import com.alvaro.tp5.repositories.PersonaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaServiceImpl extends BaseServiceImpl <Persona, Long> implements PersonaService{
    @Autowired
    private final PersonaRepository personaRepository;


    public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository, PersonaRepository personaRepository) {
        super(baseRepository);
        this.personaRepository = personaRepository;
    }
}
