package com.equifax.equifaxapi.controller;

import com.equifax.equifaxapi.model.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import com.equifax.equifaxapi.repository.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value ="api/equifax", produces ="application/json")

public class RespuestaController {
    private final RespuestaRepository respuestaData;
    private final ConsultaRepository consultaData;

    public RespuestaController(RespuestaRepository respuestaData,
    ConsultaRepository consultaData){
        this.respuestaData = respuestaData;
        this.consultaData = consultaData;
    }

    @PostMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Integer> create(@RequestBody Respuesta p){
        respuestaData.save(p);
        respuestaData.flush(); //-> id
        Respuesta generada = p;
        List<DatosConsulta> listItems = p.getDatosConsultas();
        listItems.stream().forEach(o -> o.setRespuesta(generada));
        consultaData.saveAllAndFlush(listItems);
        return new ResponseEntity<Integer>(p.getId(),HttpStatus.CREATED);
    }

    @GetMapping(value = "/{dni}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Respuesta> findByNumber(@PathVariable String dni){
        Optional<Respuesta> optRespuesta = respuestaData.findByNumero(dni);
        if(optRespuesta.isPresent()){
            Respuesta respuesta = optRespuesta.get();
            List<DatosConsulta> datosConsultas = consultaData.findItemsByRespuesta(respuesta);
            respuesta.setDatosConsultas(datosConsultas);
            return new ResponseEntity<Respuesta>(respuesta,HttpStatus.OK);
        }else{
            return new ResponseEntity<Respuesta>(HttpStatus.NOT_FOUND);
        }

        
    }
    
    @GetMapping(value = "/listaclientes/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Respuesta>> getAll() {
        List<Respuesta> respuesta = respuestaData.findAll();
            return new ResponseEntity<>(respuesta,HttpStatus.OK);

    }
}
