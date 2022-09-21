package com.example.Proyect_Beta.controlador;


import com.example.Proyect_Beta.entidades.Empleado;
import com.example.Proyect_Beta.servicios.ServImpEmpleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RequestMapping("/empleados")
@Controller
//@RestController

public class ControlEmpleado {
    @Autowired
    private ServImpEmpleado siem;

    @GetMapping
    public String listar(Model modelo){
        modelo.addAttribute("clientess",siem.listarEmpleados());
        return ("clientes") ;
    }

    @PostMapping
    public Empleado insertar(@RequestBody Empleado empl){
        return siem.guardarEmpleados(empl);
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
    public Empleado actualizarPorID(@PathVariable("id")Integer id,@RequestBody Map<Object,Object> objectMap){
        return siem.actEmpleadoId(id,objectMap);
    }
    @GetMapping("/{id}")
    public Empleado consultarPorID(@PathVariable("id")Integer id,@RequestBody Map<Object,Object> objectMap){
        return siem.consultarEmpleadosId(id,objectMap);
    }

    @DeleteMapping("/{id}")
    public void eliminarPorID(@PathVariable("id")Integer id) {
        siem.eliminarEmpleados(id);
    }


}