package com.equifax.equifaxapi.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;

import com.equifax.equifaxapi.model.*;
import com.equifax.equifaxapi.repository.*;

@RestController
@RequestMapping(value = "api/equifax", produces = "application/json")   

public class ConsultaController {
    private ConsultaRepository consultaRepository;

    public ConsultaController(ConsultaRepository employeeRepository){
        this.consultaRepository = employeeRepository;
    }

    @PostMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Integer> create(@RequestBody DatosConsulta c){
        consultaRepository.save(c);
        consultaRepository.flush();
        return new ResponseEntity<Integer>(c.getId(),HttpStatus.CREATED);
    }
}
