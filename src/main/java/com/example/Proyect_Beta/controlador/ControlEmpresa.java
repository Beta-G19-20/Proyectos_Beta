package com.example.Proyect_Beta.controlador;

import com.example.Proyect_Beta.entidades.Empresa;
import com.example.Proyect_Beta.servicios.ServImpEmpresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RequestMapping("/empresas")
//@RestController
@Controller
public class ControlEmpresa {

    @Autowired
    ServImpEmpresa sie;

    public ControlEmpresa (ServImpEmpresa sie){
        this.sie=sie;
    }


    @GetMapping
    public String listar(Model modelo){
        modelo.addAttribute("companiass", sie.listarEmpresas());
        return "companias";
    }

    @PostMapping
    public Empresa insertar(@RequestBody Empresa emp){
        return sie.guardarEmpresas(emp);
    }

    @PutMapping
    public Empresa actualizarEmpresa(@RequestBody Empresa emp){
        return sie.actualizarEmpresas(emp);
    }

    @DeleteMapping
    public void borrarEmpresa(@RequestBody Empresa emp){
        sie.eliminarEmpresas(emp.getIdEmp());
    }

    @PatchMapping("/{id}")
    public Empresa actualizarPorID(@PathVariable("id")Long id,@RequestBody Map<Object,Object> objectMap){
        return sie.actEmpresasId(id,objectMap);
    }
    @GetMapping("/{id}")
    public Empresa consultarPorID(@PathVariable("id")Long id,@RequestBody Map<Object,Object> objectMap){
        return sie.consultarEmpresasId(id,objectMap);
    }

    @DeleteMapping("/{id}")
    public void eliminarPorID(@PathVariable("id")Long id) {
        sie.eliminarEmpresas(id);
    }


}
