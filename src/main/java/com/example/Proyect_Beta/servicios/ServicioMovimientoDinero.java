package com.example.Proyect_Beta.servicios;

import com.example.Proyect_Beta.entidades.MovimientoDinero;

import java.util.List;
import java.util.Map;

public interface ServicioMovimientoDinero {

    public List<MovimientoDinero>listarMovimientoDinero();

    public MovimientoDinero consultarClientesPorId(Integer documento);

}
