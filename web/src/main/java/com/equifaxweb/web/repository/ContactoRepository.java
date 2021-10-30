package com.equifaxweb.web.repository;

import com.equifaxweb.web.model.Contacto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactoRepository extends JpaRepository<Contacto, Integer> {
    
}
