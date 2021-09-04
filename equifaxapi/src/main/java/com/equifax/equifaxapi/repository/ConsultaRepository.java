package com.equifax.equifaxapi.repository;


import com.equifax.equifaxapi.model.*;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.*;

import java.util.*;


@Repository
public interface ConsultaRepository extends JpaRepository<DatosConsulta, Integer> {
    @Query(value = "SELECT o FROM DatosConsulta o WHERE o.respuesta=?1")
    List<DatosConsulta> findItemsByRespuesta(Respuesta respuesta);
}
