package com.alvaro.tp5.services;

import com.alvaro.tp5.entities.BaseEntidad;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;

public interface BaseService <E extends BaseEntidad, ID extends Serializable> {
    public List<E> findAll() throws Exception;
    public Page<E> findAll(Pageable pageable) throws Exception;
    public E findById (Long id) throws Exception;

    @Transactional
    E findById(ID id) throws Exception;

    public E save (E entity) throws  Exception;
    public E update (Long id, E entity) throws Exception;
    public boolean delete(Long id) throws Exception;

    @Transactional
    E update(ID id, E entity) throws Exception;

    @Transactional
    boolean delete(ID id) throws Exception;
}
