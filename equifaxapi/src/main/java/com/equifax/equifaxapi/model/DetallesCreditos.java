package com.equifax.equifaxapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "t_detallesCreditos")

public class DetallesCreditos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String description;
    private String detalleCreditosRCC; //saldo de crédito
    private String detalleCreditosMFNZ; //Creditos Microfinanzas
    private String avalistasAvalados;   //avalistas y avalados

}
