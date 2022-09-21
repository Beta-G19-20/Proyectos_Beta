package com.example.Proyect_Beta.repositorio;

import com.example.Proyect_Beta.entidades.MovimientoDinero;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.lang.*;
import java.util.List;

public interface RepositorioMovimientoDinero extends JpaRepository<MovimientoDinero, Long> {
    @Query(value = "SELECT * FROM movimientos_dinero WHERE mov_empresa = ?", nativeQuery = true)
    public abstract List<MovimientoDinero> getMovimiento(long idEmp);




}
