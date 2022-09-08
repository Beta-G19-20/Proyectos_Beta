package com.example.Proyect_Beta.servicios;

import com.example.Proyect_Beta.entidades.Empresa;

import java.util.List;
import java.util.Map;

public interface ServiEmpresa
{
    public List<Empresa> listarEmpresas();
    public Empresa guardarEmpresas(Empresa empresa);
    public Empresa consultarEmpresasPorId(Integer nit);
    public Empresa actualizarEmpresas(Empresa empresa);
    public void eliminarEmpresas(Integer nit);

    public Empresa actEmpresasId(Integer id, Map<Object,Object> objectMap);

    public Empresa consultarEmpresasId(Integer id, Map<Object,Object> objectMap);



}
