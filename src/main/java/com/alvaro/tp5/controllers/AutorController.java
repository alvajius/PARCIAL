package com.alvaro.tp5.controllers;

import com.alvaro.tp5.entities.Autor;
import com.alvaro.tp5.services.AutorService;
import com.alvaro.tp5.services.AutorServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/basedatos/autores")
public class AutorController extends BaseControllerImpl<Autor, AutorServiceImpl> {
}
