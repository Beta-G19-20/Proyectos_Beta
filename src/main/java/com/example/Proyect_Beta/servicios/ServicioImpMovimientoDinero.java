package com.example.Proyect_Beta.servicios;

import com.example.Proyect_Beta.entidades.MovimientoDinero;
import com.example.Proyect_Beta.repositorio.RepositorioMovimientoDinero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

@Service
public class ServicioImpMovimientoDinero implements ServicioMovimientoDinero{

    @Autowired
    private RepositorioMovimientoDinero repositorioMovimientoDinero;

    public ServicioImpMovimientoDinero  (RepositorioMovimientoDinero repositorioMovimientoDinero){
        this.repositorioMovimientoDinero = repositorioMovimientoDinero;
    }


    @Override
    public List<MovimientoDinero> listarMovimientoDinero() {
        return repositorioMovimientoDinero.findAll();
    }


    @Override
    public MovimientoDinero actualizarMovimientoDinero(MovimientoDinero movimientoDinero) {
        return this.repositorioMovimientoDinero.save(movimientoDinero);
    }

    @Override
    public void eliminarMovimientoDineroId(Long idMovimiento) {
        repositorioMovimientoDinero.deleteById(idMovimiento);
    }
    @Override
    public MovimientoDinero actualizarPorId(Long mov, Map<Object, Object> objectMap) {
        MovimientoDinero idEmpleado=repositorioMovimientoDinero.findById(mov).get();
        objectMap.forEach((key,value)->{
            Field field= ReflectionUtils.findField(MovimientoDinero.class, (String) key);
            field.setAccessible(true);
            ReflectionUtils.setField(field, idEmpleado, value);
        });
        return repositorioMovimientoDinero.save(idEmpleado);

    }


    @Override
    public List<MovimientoDinero> getMovimiento(Long mov_empresa) {
        return this.repositorioMovimientoDinero.getMovimiento(mov_empresa);
    }

    @Override
    public void eliminarMovEmpresa(Long id) {
        this.repositorioMovimientoDinero.deleteById(id);
    }

    @Override
    public MovimientoDinero getMovimientoDineroById(long id){
        return this.repositorioMovimientoDinero.findById(id).get();
    }

    @Override
    public MovimientoDinero guardarMovimientoDineroPorID(MovimientoDinero movimientoDinero) {
        return repositorioMovimientoDinero.save(movimientoDinero);
    }

    @Override
    public MovimientoDinero consultarMovimientosPorId(Integer idMovimiento) {
        return null;
    }

    @Override
    public MovimientoDinero consultarMovimientosPorId(Long idMovimiento) {
        return repositorioMovimientoDinero.findById(idMovimiento).get();
    }

}