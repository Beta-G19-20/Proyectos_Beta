package com.example.Proyect_Beta.servicios;

import com.example.Proyect_Beta.entidades.MovimientoDinero;
import java.lang.*;
import java.util.List;
import java.util.Map;

public interface ServicioMovimientoDinero {



    public List<MovimientoDinero>listarMovimientoDinero();

    public MovimientoDinero actualizarMovimientoDinero(MovimientoDinero movimientoDinero);

    public void eliminarMovimientoDineroId(Long idMovimiento);

    public MovimientoDinero actualizarPorId(Long mov, Map<Object,Object> objectMap);

    public List<MovimientoDinero> getMovimiento(Long idEmp);

    void eliminarMovEmpresa(Long id);


    MovimientoDinero getMovimientoDineroById(long id);

}