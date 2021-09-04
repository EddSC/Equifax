package com.equifax.equifaxapi.repository;

import java.util.Optional;
import com.equifax.equifaxapi.model.DetallesCreditos;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.jpa.repository.Query;

public interface DetalleCreditosRepository extends JpaRepository<DetallesCreditos, Integer> {
    @Query(value = "SELECT o FROM DetallesCreditos o WHERE o.id=?1")
    Optional<DetallesCreditos> findByNumero(int id);
    
}
