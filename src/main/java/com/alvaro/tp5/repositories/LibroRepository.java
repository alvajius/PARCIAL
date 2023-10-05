package com.alvaro.tp5.repositories;

import com.alvaro.tp5.entities.Libro;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends BaseRepository<Libro, Long> {

}
