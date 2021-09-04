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
@Table(name = "t_datoGenerales")
public class DatosGenerales {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String datosPersonales;
    private String datosGeneralesSunat;
    private String representantes;
    private String direcciones;
    private String telefonos;
}
