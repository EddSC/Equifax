package com.equifaxweb.web.controller.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import java.util.*;

import com.equifaxweb.web.model.Usuario;
import com.equifaxweb.web.repository.*;

@RestController
@RequestMapping(value = "api/dashboard", produces = "application/json")
public class DashboardController {

    private final UsuarioRepository cliente;

    public DashboardController(UsuarioRepository cliente){
        this.cliente = cliente;
    } 

    @GetMapping(value = "/clientes", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Usuario>>   cliente(){
        return  new ResponseEntity<List<Usuario>>(cliente.findAll(), HttpStatus.OK);
    }


}
