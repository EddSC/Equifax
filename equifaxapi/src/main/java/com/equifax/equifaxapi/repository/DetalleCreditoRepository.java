package com.equifax.equifaxapi.repository;

import com.equifax.equifaxapi.model.*;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.*;

import java.util.*;

@Repository
public interface DetalleCreditoRepository extends JpaRepository<DetallesCredito, Integer> {
    @Query(value = "SELECT o FROM DetallesCredito o WHERE o.respuesta=?1")
    Optional<DetallesCredito> findItemsByRespuesta(Respuesta respuesta);
    
}
