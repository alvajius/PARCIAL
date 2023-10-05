package com.alvaro.tp5.controllers;

import com.alvaro.tp5.entities.Persona;
import com.alvaro.tp5.services.PersonaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/basedatos/personas")

public class personaController extends BaseControllerImpl <Persona, PersonaServiceImpl> {

}
