package com.example.Proyect_Beta.controlador;

import com.example.Proyect_Beta.entidades.MovimientoDinero;
import com.example.Proyect_Beta.servicios.ServicioImpMovimientoDinero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

//@RequestMapping("/enterprises/{idEmpresa}/movements")
@RequestMapping("/movimientoDinero")
@RestController


public class ControladorMovimientoDinero {



    @Autowired
    private ServicioImpMovimientoDinero sic;

    @GetMapping("/login")
    public String listar(Model modelo) {
        modelo.addAttribute("clientes", sic.listarMovimientoDinero());
        return ("login");
    }

   /* @GetMapping("/login")
    public String listar(Model modelo) {
        modelo.addAttribute("login", sic.listarMovimientoDinero());
        return "redirect:/login";
    }

    /*@GetMapping
    public List<MovimientoDinero> listar(){
        return sic.listarMovimientoDinero();
    }*/

    @GetMapping("/{id}")
    public MovimientoDinero consultarPorId(@PathVariable("id") Integer idMovimiento) {
        return sic.consultarMovimientosPorId(idMovimiento);
    }

    @PostMapping
    public MovimientoDinero insertar(@RequestBody MovimientoDinero idMovimiento){
        return sic.guardarMovimientoDineroPorID(idMovimiento);
    }

    @PutMapping
    public MovimientoDinero actualizar(@RequestBody MovimientoDinero idMovimiento){
        return sic.actualizarMovimientoDinero(idMovimiento);
    }

    @DeleteMapping("/{id}")
    public void eliminarporId(@PathVariable("id") Integer idMovimiento){
        sic.eliminarMovimientoDineroId(idMovimiento);
    }

    @PatchMapping("/{id}")
    public MovimientoDinero actualizarpor(@PathVariable("id")Integer id, @RequestBody Map<Object,Object> objectMap){
        return sic.actualizarPorId(id,objectMap);
    }

}
