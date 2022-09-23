package com.example.Proyect_Beta.controlador;


import com.example.Proyect_Beta.entidades.Empleado;
import com.example.Proyect_Beta.servicios.ServImpEmpleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RequestMapping("/empleados")
//@RestController
@Controller


public class ControlEmpleado {
    String retorno = "login";
    @Autowired
    private ServImpEmpleado siem;

    @GetMapping
    public String login(){

        return retorno ;
    }

    @GetMapping("consu")
    public String listar(Model modelo){
        modelo.addAttribute("clientess",siem.listarEmpleados());
        return "clientes" ;
    }
    @GetMapping("log")
    public String login2( ){
        retorno = "login";
        return "redirect:/empleados" ;
    }
    @GetMapping("empre")
    public String nuevaempre( ){
        retorno = "nuevaempresa";
        return "redirect:/empleados" ;
    }
    @GetMapping("emple")
    public String formularioregistr( ){
        retorno = "nuevousuario";
        return "redirect:/empleados" ;
    }

    @GetMapping("inde")
    public String index( ){
        return "redirect:/" ;
    }

    @GetMapping("/nuevos")   //    mostrar formulario
    public String formularioregistro(Model modelo) {
        modelo.addAttribute("empleadoinsertar", new Empleado());
        return "nuevousuario";
    }

    @PostMapping("/guardar")
    public String insertar( Empleado empl){
         siem.guardarEmpleados(empl);
        return "redirect:/empleados/consu";
    }

    @PutMapping
    public Empleado actualizarEmpresa(@RequestBody Empleado empl){
        return siem.actualizarEmpleados(empl);
    }

    @DeleteMapping
    public void borrarEmpresa(@RequestBody Empleado empl){
        siem.eliminarEmpleados(empl.getIdEmpleado());
    }

    @PatchMapping("/{id}")
    public Empleado actualizarPorID(@PathVariable("id")Long id,@RequestBody Map<Object,Object> objectMap){
        return siem.actEmpleadoId(id,objectMap);
    }
    @GetMapping("/{id}")
    public Empleado consultarPorID(@PathVariable("id")Long id,@RequestBody Map<Object,Object> objectMap){
        return siem.consultarEmpleadosId(id,objectMap);
    }

    @DeleteMapping("/{id}")
    public void eliminarPorID(@PathVariable("id")Long id) {
        siem.eliminarEmpleados(id);
    }


}

//Consultar un movimiento por id según la empresa    @GetMapping("enterprises/{idE}/movements/{idM}")