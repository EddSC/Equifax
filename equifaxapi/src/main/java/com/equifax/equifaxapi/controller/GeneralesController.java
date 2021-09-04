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

public class GeneralesController {

    private DatosGeneralesRepository datosGeneralesRepository;

    public GeneralesController(DatosGeneralesRepository datosGeneralesData){
        this.datosGeneralesRepository = datosGeneralesData;
    }

    @PostMapping(value = "/generales", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Integer> datos(@RequestBody DatosGenerales c){
        datosGeneralesRepository.save(c);
        datosGeneralesRepository.flush();
        return new ResponseEntity<Integer>(c.getId(),HttpStatus.CREATED);
    }
}
