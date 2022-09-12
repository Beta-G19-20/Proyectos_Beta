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

    //public ServicioImpMovimientoDinero(RepositorioMovimientoDinero repositorioMovimientoDinero) {
    //    this.repositorioMovimientoDinero = repositorioMovimientoDinero;
    //}

    @Override
    public List<MovimientoDinero> listarMovimientoDinero() {
        return repositorioMovimientoDinero.findAll();
    }

    @Override
    public MovimientoDinero consultarMovimientosPorId(Integer idMovimiento) {
        return repositorioMovimientoDinero.findById(idMovimiento).get();
    }

    @Override
    public MovimientoDinero guardarMovimientoDineroPorID(MovimientoDinero movimientoDinero) {
        return repositorioMovimientoDinero.save(movimientoDinero);
    }

    @Override
    public MovimientoDinero actualizarMovimientoDinero(MovimientoDinero movimientoDinero) {
        return repositorioMovimientoDinero.save(movimientoDinero);
    }

    @Override
    public void eliminarMovimientoDineroId(Integer idMovimiento) {
        repositorioMovimientoDinero.deleteById(idMovimiento);
    }
    @Override
    public MovimientoDinero actualizarPorId(Integer mov, Map<Object, Object> objectMap) {
        MovimientoDinero idEmpleado=repositorioMovimientoDinero.findById(mov).get();
        objectMap.forEach((key,value)->{
            Field field= ReflectionUtils.findField(MovimientoDinero.class, (String) key);
            field.setAccessible(true);
            ReflectionUtils.setField(field, idEmpleado, value);
        });
        return repositorioMovimientoDinero.save(idEmpleado);


  //  public MovimientoDinero consultarMovPorId(Integer id, Map<Object, Object> objectMap) {

     //   MovimientoDinero mov=repositorioMovimientoDinero.findById(id).get();
     //   objectMap.forEach((key,value)->{
      //      Field field = ReflectionUtils.findField(MovimientoDinero.class, (String) key);
       //     field.setAccessible(true);
      //      ReflectionUtils.setField(field, mov, value);
      //  });
      //  return repositorioMovimientoDinero.save(mov);


    //public MovimientoDinero guardarMovimientoDineroPorID(Integer id, Map<Object, Object> objectMap) {

     //   MovimientoDinero movd=repositorioMovimientoDinero.findById(id).get();
      //  objectMap.forEach((key,value)->{
      //      Field field = ReflectionUtils.findField(MovimientoDinero.class, (String) key);
      //      field.setAccessible(true);
      //      ReflectionUtils.setField(field, movd, value);
      //  });
      //  return repositorioMovimientoDinero.save(movd);

    }
}
