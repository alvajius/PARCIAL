package com.alvaro.tp5.services;
import java.util.List;

import com.alvaro.tp5.entities.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PersonaService extends BaseService<Persona, Long> {
    List<Persona> search(String filtro) throws Exception;
    Page<Persona> search(String filtro, Pageable pageable) throws Exception;
}
