package com.alvaro.tp5.controllers;

import com.alvaro.tp5.entities.Libro;
import com.alvaro.tp5.services.LibroServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/basedatos/libros")
public class LibroController extends BaseControllerImpl<Libro, LibroServiceImpl> {
}
