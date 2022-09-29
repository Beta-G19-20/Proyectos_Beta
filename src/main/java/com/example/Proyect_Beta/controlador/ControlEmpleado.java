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
    String retorno = "index";
    @Autowired
    private ServImpEmpleado siem;

    @GetMapping
    public String login(){
        return retorno ;
    }

    @GetMapping("/consu")
    public String listar(Model modelo){
        modelo.addAttribute("clientess",siem.listarEmpleados());
        return "clientes" ;
    }
    @GetMapping("log")
    public String login2( ){
        retorno = "login";
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

    @GetMapping("/actualizar/{dato}")
    public String formularioActualizar(@PathVariable("dato") Long dato, Model modelo){
        Empleado empleado = siem.consultarEmpleadosPorId(dato);
        modelo.addAttribute("empleadoactualizar", empleado);
        return "actualizarusuario";
    }


    @PostMapping("/actualizar")
    public String actualizarEmpresa( Empleado empl){
        siem.actualizarEmpleados(empl);
        return ("redirect:/empleados/consu");
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarPorID(@PathVariable("id")Long id) {
        siem.eliminarEmpleados(id);
        return ("redirect:/empleados/consu");
    }


}

//Consultar un movimiento por id según la empresa    @GetMapping("enterprises/{idE}/movements/{idM}")