package com.example.Proyect_Beta.repositorio;

import com.example.Proyect_Beta.entidades.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoEmpleado extends JpaRepository <Empleado, Integer> {
}
