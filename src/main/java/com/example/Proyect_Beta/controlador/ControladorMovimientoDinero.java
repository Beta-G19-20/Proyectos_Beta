package com.example.Proyect_Beta.controlador;

import com.example.Proyect_Beta.entidades.MovimientoDinero;
import com.example.Proyect_Beta.servicios.ServicioImpMovimientoDinero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

//@RequestMapping("/enterprises/{idEmpresa}/movements")
@RequestMapping("/movimientoDinero")
@Controller


public class ControladorMovimientoDinero {
    String retorno = "login";
    @Autowired
    private ServicioImpMovimientoDinero sic;

    @GetMapping
    public String login(){

        return retorno ;
    }

    @GetMapping("all")
    public String sistall( ){
        retorno = "sistemaGestionAll";
        return "redirect:/movimientoDinero" ;
    }

    @GetMapping("ingygas")
    public String tabmov( ){
        retorno = "tablamovimientodinero";
        return "redirect:/movimientoDinero" ;
    }

    @GetMapping("newmovd")
    public String nmd( ){
        retorno = "nuevomovimientodinero";
        return "redirect:/movimientoDinero" ;
    }


    @GetMapping("/movimientosDinero")
    public String listar(Model modelo) {
        modelo.addAttribute("movimientosDineros", sic.listarMovimientoDinero());
        return ("tablamovimientodinero");
    }

    @GetMapping("/movimientosDinero/nuevo")
    public String fotmularioregistro(Model modelo) {
        modelo.addAttribute("movimientosDineroinsertar", new MovimientoDinero());
        return "nuevomovimientodinero";
    }

    @PostMapping("movimientosDinero/guardar")
    public String insertar1(MovimientoDinero cli) {
        sic.guardarMovimientoDineroPorID(cli);
        return "redirect:/movimientosDinero";
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
