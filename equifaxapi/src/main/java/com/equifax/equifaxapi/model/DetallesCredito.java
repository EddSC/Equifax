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
@Table(name = "t_detallesCreditos")

public class DetallesCredito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String description;
    private String detalleCreditosRCC; //saldo de crédito
    private String detalleCreditosMFNZ; //Creditos Microfinanzas
    private String avalistasAvalados;   //avalistas y avalados
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "respuesta_id")    
    private Respuesta respuesta;

}
