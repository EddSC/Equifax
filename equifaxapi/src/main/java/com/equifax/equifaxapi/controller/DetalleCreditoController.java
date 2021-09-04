package com.equifax.equifaxapi.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;

import com.equifax.equifaxapi.model.*;
import com.equifax.equifaxapi.repository.*;

@RestController
@RequestMapping(value = "api/equifax/detalles", produces = "application/json")  

public class DetalleCreditoController {
    private DetalleCreditoRepository detalleCreditoRepository;

    public DetalleCreditoController(DetalleCreditoRepository detalleRepository){
        this.detalleCreditoRepository = detalleRepository;
    }

    @PostMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Integer> create(@RequestBody DetallesCredito dc){
        detalleCreditoRepository.save(dc);
        detalleCreditoRepository.flush();
        return new ResponseEntity<Integer>(dc.getId(),HttpStatus.CREATED);
    }
    
}
