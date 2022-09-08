package com.example.Proyect_Beta.servicios;


import com.example.Proyect_Beta.entidades.MovimientoDinero;
import com.example.Proyect_Beta.repositorio.RepositorioMovimientoDinero;
import org.apache.el.util.ReflectionUtil;
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

    @Override
    public List<MovimientoDinero> listarMovimientoDinero() {
        return repositorioMovimientoDinero.findAll();
    }

    @Override
    public MovimientoDinero consultarClientesPorId(Integer documento) {
        return repositorioMovimientoDinero.findById(documento).get();
    }

}
