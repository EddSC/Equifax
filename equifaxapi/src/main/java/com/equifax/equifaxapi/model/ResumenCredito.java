package com.equifax.equifaxapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity

@Table(name = "t_resumenCredito")


public class ResumenCredito {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String description;
    private String endeudamientoTotal; 
    private String deudaTipoProductoRC; 
    private String detalleProducto; 
    private String indicadoresSBS;
    private String calificacion;
    private String sBSUltimos24Meses;

}
