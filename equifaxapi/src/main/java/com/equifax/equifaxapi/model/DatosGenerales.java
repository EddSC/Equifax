package com.equifax.equifaxapi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
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
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "respuesta_id")    
    private Respuesta respuesta;
}
