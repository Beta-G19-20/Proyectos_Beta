package com.example.Proyect_Beta.servicios;

import com.example.Proyect_Beta.entidades.Empleado;
import com.example.Proyect_Beta.repositorio.RepoEmpleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

@Service
public class ServImpEmpleado implements ServiEmpleado {

    @Autowired
    private RepoEmpleado repoEmpleado;

    public ServImpEmpleado (RepoEmpleado repoEmpleado){
        this.repoEmpleado=repoEmpleado;
    }
    @Override
    public List<Empleado> listarEmpleados() {
        return  repoEmpleado.findAll();
    }

    @Override
    public Empleado guardarEmpleados(Empleado empleado) {
        return this.repoEmpleado.save(empleado);
    }

    @Override
    public Empleado consultarEmpleadosPorId(Long idEmpleado) {
        return repoEmpleado.findById(idEmpleado).get();
    }

    @Override
    public Empleado actualizarEmpleados(Empleado empleado) {
        return repoEmpleado.save(empleado);
    }

    @Override
    public void eliminarEmpleados(Long idEmpleado) {
        repoEmpleado.deleteById(idEmpleado);
    }

    @Override
    public Empleado actEmpleadoId(Long id, Map<Object, Object> objectMap) {
        Empleado empl= repoEmpleado.findById(id).get();
        objectMap.forEach((key,value)->{
            Field field = ReflectionUtils.findField(Empleado.class, (String) key);
            field.setAccessible(true);
            ReflectionUtils.setField(field, empl, value);
        });
        return repoEmpleado.save(empl);
    }

    @Override
    public Empleado consultarEmpleadosId(Long id, Map<Object, Object> objectMap) {
        Empleado empl= repoEmpleado.findById(id).get();
        objectMap.forEach((key,value)->{
            Field field = ReflectionUtils.findField(Empleado.class, (String) key);
            field.setAccessible(true);
            ReflectionUtils.setField(field, empl, value);
        });
        return repoEmpleado.save(empl);

    }
}// fin class
