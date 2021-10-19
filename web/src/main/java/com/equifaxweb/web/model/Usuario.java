package com.equifaxweb.web.model;

import lombok.*;
import java.io.Serializable;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Usuario implements Serializable{
    
    private String userID;
    private String password;
    private String tipoUsuario;
}
