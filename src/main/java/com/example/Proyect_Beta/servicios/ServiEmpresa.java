package com.example.Proyect_Beta.servicios;

import com.example.Proyect_Beta.entidades.Empresa;

import java.util.List;
import java.util.Map;

public interface ServiEmpresa
{
    public List<Empresa> listarEmpresas();
    public Empresa guardarEmpresas(Empresa empresa);
    public Empresa consultarEmpresasPorId(Long idEmp);
    public Empresa actualizarEmpresas(Empresa empresa);
    public void eliminarEmpresas(Long idEmp);

    public Empresa actEmpresasId(Long id, Map<Object,Object> objectMap);

    public Empresa consultarEmpresasId(Long id, Map<Object,Object> objectMap);



}
