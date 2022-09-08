package com.example.Proyect_Beta.repositorio;

import com.example.Proyect_Beta.entidades.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoEmpresa extends JpaRepository<Empresa, Integer>
{



}
