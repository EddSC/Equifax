package com.equifax.equifaxapi.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.*;
import com.equifax.equifaxapi.model.*;

import java.util.Optional;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface RespuestaRepository extends JpaRepository<Respuesta, Integer>{
    @Query(value = "SELECT o FROM Respuesta o WHERE o.usuario=?1")
    Optional<Respuesta> findByNumero(String usuario);
}
