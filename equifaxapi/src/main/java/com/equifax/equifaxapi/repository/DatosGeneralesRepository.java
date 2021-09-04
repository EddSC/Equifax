package com.equifax.equifaxapi.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.*;
import com.equifax.equifaxapi.model.*;

import java.util.Optional;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface DatosGeneralesRepository extends JpaRepository<DatosGenerales, Integer> {
    @Query(value = "SELECT o FROM DatosGenerales o WHERE o.respuesta=?1")
    Optional<DatosGenerales> findItemsByRespuesta(Respuesta respuesta);
}
