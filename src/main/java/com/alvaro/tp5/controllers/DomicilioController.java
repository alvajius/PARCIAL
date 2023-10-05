package com.alvaro.tp5.controllers;

import com.alvaro.tp5.entities.Domicilio;
import com.alvaro.tp5.services.DomicilioServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/basedatos/domicilios")

public class DomicilioController extends BaseControllerImpl <Domicilio, DomicilioServiceImpl> {
}
