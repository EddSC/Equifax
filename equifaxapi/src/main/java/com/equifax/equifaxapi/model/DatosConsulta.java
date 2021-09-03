package com.equifax.equifaxapi.model;

import java.math.BigDecimal;
import java.sql.Date;

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
@Table(name = "t_datoConsulta")

public class DatosConsulta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Date fechaConsulta;
    private int numeroConsulta;
    private String usuario;
    private BigDecimal tipoCambio;
}
