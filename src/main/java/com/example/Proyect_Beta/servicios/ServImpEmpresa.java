package com.example.Proyect_Beta.servicios;

import com.example.Proyect_Beta.entidades.Empresa;
import com.example.Proyect_Beta.repositorio.RepoEmpresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

@Service
public class ServImpEmpresa implements ServiEmpresa {

    @Autowired
    private RepoEmpresa repoEmpresa;

    public ServImpEmpresa (RepoEmpresa repoEmpresa){
        this.repoEmpresa=repoEmpresa;
    }

    @Override
    public List<Empresa> listarEmpresas() {
        return repoEmpresa.findAll();
    }

    @Override
    public Empresa guardarEmpresas(Empresa empresa) {
        return this.repoEmpresa.save(empresa);
    }

    @Override
    public Empresa consultarEmpresasPorId(Long idEmp) {
        return repoEmpresa.findById(idEmp).get();
    }

    @Override
    public Empresa actualizarEmpresas(Empresa empresa) {
        return repoEmpresa.save(empresa);
    }

    @Override
    public void eliminarEmpresas(Long idEmp) {

        repoEmpresa.deleteById(idEmp);

    }

    @Override
    public Empresa actEmpresasId(Long id, Map<Object, Object> objectMap) {

        Empresa emp= repoEmpresa.findById(id).get();
        objectMap.forEach((key,value)->{
            Field field = ReflectionUtils.findField(Empresa.class, (String) key);
            field.setAccessible(true);
            ReflectionUtils.setField(field, emp, value);
        });
        return repoEmpresa.save(emp);

    }
    public Empresa consultarEmpresasId(Long id, Map<Object, Object> objectMap) {

        Empresa emp= repoEmpresa.findById(id).get();
        objectMap.forEach((key,value)->{
            Field field = ReflectionUtils.findField(Empresa.class, (String) key);
            field.setAccessible(true);
            ReflectionUtils.setField(field, emp, value);
        });
        return repoEmpresa.save(emp);

    }



}
