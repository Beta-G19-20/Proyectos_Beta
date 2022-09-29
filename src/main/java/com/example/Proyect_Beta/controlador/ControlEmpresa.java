package com.example.Proyect_Beta.controlador;

//import com.example.Proyect_Beta.entidades.Empleado;
import com.example.Proyect_Beta.entidades.Empresa;
import com.example.Proyect_Beta.servicios.ServImpEmpresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

//import java.util.Map;

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
    public String lista(){
        return "companias";
    }
    @GetMapping("/consu")
    public String listar(Model modelo){
        modelo.addAttribute("companiass",sie.listarEmpresas());
        return "companias" ;
    }

    @GetMapping("/nuevos")   //    mostrar formulario
    public String formularioregistro(Model modelo) {
        modelo.addAttribute("empresainsertar", new Empresa());
        return "nuevaempresa";
    }
    @PostMapping("/guardar")
    public String insertarEmpr( Empresa empr){
        sie.guardarEmpresas(empr);
        return "redirect:/empresas/consu";
    }

    @GetMapping("/actualizar/{dato}")
    public String formularioActualizar(@PathVariable("dato") Long dato, Model modelo){
        Empresa empresa = sie.consultarEmpresasPorId(dato);
        modelo.addAttribute("empresaactualizar", empresa);
        return "actualizarempresa";
    }

    @PostMapping("/actualizar")
    public String actualizarEmpresa(Empresa emp){
        sie.actualizarEmpresas(emp);
        return "redirect:/empresas/consu";
    }
    @GetMapping("/eliminar/{id}")
    public String eliminarPorID(@PathVariable("id")Long id) {
        sie.eliminarEmpresas(id);
        return ("redirect:/empresas/consu");
    }


}
