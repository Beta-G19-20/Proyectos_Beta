package com.example.Proyect_Beta.servicios;

import com.example.Proyect_Beta.entidades.MovimientoDinero;

import java.util.List;
import java.util.Map;

public interface ServicioMovimientoDinero {

    public List<MovimientoDinero>listarMovimientoDinero();

    //public MovimientoDinero guardarMovimientoDinero(MovimientoDinero movimientoDinero);

    public MovimientoDinero guardarMovimientoDineroPorID(MovimientoDinero movimientoDinero);

    public MovimientoDinero consultarMovimientosPorId(Integer idMovimiento);

    public MovimientoDinero actualizarMovimientoDinero(MovimientoDinero movimientoDinero);

    public void eliminarMovimientoDineroId(Integer idMovimiento);

    //public MovimientoDinero guardarMovimientoDineroPorID(Integer id);

    public MovimientoDinero actualizarPorId(Integer mov, Map<Object,Object> objectMap);

    //public MovimientoDinero consultarMovPorId(Integer id, Map<Object,Object> objectMap);


}