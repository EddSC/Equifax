package com.equifax.equifaxapi.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.*;
import com.equifax.equifaxapi.model.*;

import java.util.Optional;
import org.springframework.data.jpa.repository.Query;
@Repository
public interface ConsultaRepository extends JpaRepository<DatosConsulta, Integer> {
    @Query(value = "SELECT o FROM DatosConsulta o WHERE o.usuario=?1")
    Optional<DatosConsulta> findByNumero(String usuario);
}
