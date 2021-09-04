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

    private GeneralesRepository generalesRepository;

    public GeneralesController(GeneralesRepository generalesData){
        this.generalesRepository = generalesData;
    }

    @PostMapping(value = "/generales", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Integer> datos(@RequestBody DatosGenerales c){
        generalesRepository.save(c);
        generalesRepository.flush();
        return new ResponseEntity<Integer>(c.getId(),HttpStatus.CREATED);
    }
}
