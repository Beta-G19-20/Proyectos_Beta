package com.example.Proyect_Beta.controlador;

import com.example.Proyect_Beta.entidades.MovimientoDinero;
import com.example.Proyect_Beta.servicios.ServicioImpMovimientoDinero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RequestMapping("/enterprises/{id}/movements")
@RequestMapping("/movimientoDinero")
@RestController


public class ControladorMovimientoDinero {

    @Autowired
    private ServicioImpMovimientoDinero sic;

    @GetMapping
    public List<MovimientoDinero> listar(){
        return sic.listarMovimientoDinero();
    }

    @GetMapping("/{id}")
    public MovimientoDinero consultar(@PathVariable("id") Integer id) {
        return sic.consultarClientesPorId(id);
    }

}
