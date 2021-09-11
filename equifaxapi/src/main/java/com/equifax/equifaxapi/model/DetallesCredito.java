package com.equifax.equifaxapi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "t_detallesCreditos")

public class DetallesCredito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String entidad; //Microfinanzas
    private BigDecimal deuda; //saldo de deuda
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date fecha; 
    private Integer calificacion;   //del 0 - 4
    private Integer diasVencidas;
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "respuesta_id")    
    private Respuesta respuesta;

}
