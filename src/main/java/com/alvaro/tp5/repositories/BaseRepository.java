package com.alvaro.tp5.repositories;

import com.alvaro.tp5.entities.BaseEntidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean
public interface BaseRepository <E extends BaseEntidad, ID extends Serializable> extends JpaRepository<E, ID> {
}
