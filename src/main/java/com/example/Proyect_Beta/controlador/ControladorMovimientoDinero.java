package com.example.Proyect_Beta.controlador;

import com.example.Proyect_Beta.servicios.*;
import com.example.Proyect_Beta.entidades.Empresa;
import com.example.Proyect_Beta.entidades.Empleado;
import com.example.Proyect_Beta.entidades.MovimientoDinero;
import com.example.Proyect_Beta.servicios.ServImpEmpresa;
import com.example.Proyect_Beta.servicios.ServImpEmpleado;
import com.example.Proyect_Beta.servicios.ServicioImpMovimientoDinero;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.lang.*;
import java.util.List;
import java.util.Map;


@RequestMapping("/movimientos")
//@RestController
@Controller
public class ControladorMovimientoDinero {

    ServicioImpMovimientoDinero sic;

    ServImpEmpresa servImpEmpresa;

    ServImpEmpleado servImpEmpleado;

    public ControladorMovimientoDinero(ServicioImpMovimientoDinero sic, ServImpEmpresa servImpEmpresa, ServImpEmpleado servImpEmpleado) {
        this.sic = sic;
        this.servImpEmpresa = servImpEmpresa;
        this.servImpEmpleado = servImpEmpleado;
    }

    @GetMapping
    public String listar(Model modelo){
        modelo.addAttribute("transaccioness", sic.listarMovimientoDinero());
        return ("transacciones");
    }


    @GetMapping("/empresas/{id}/movimientos")
    public List<MovimientoDinero> getMovimiento(@PathVariable Long id){

        return this.sic.getMovimiento(id);
    }

    @DeleteMapping("/empresas/{id}/movimientos")
    public void eliminarMovEmpresa(@PathVariable Long id, @RequestBody MovimientoDinero movimientoDinero){
        MovimientoDinero mov =  sic.getMovimientoDineroById(movimientoDinero.getIdMovimiento());
        if (mov.getEmpresaM().getIdEmp() == id){
            this.sic.eliminarMovEmpresa(movimientoDinero.getIdMovimiento());
        }
        else {
            throw new RuntimeException();
        }
    }


    @PostMapping("/empresas/{id}/movimientos")
    public MovimientoDinero actualizarMovimientoDinero (@PathVariable long id, @RequestBody MovimientoDinero movimientoDinero){
        Empresa empresa = servImpEmpresa.consultarEmpresasPorId(id);
        Empleado empleado = servImpEmpleado.consultarEmpleadosPorId(movimientoDinero.getEmpleadoM().getIdEmpleado());
        if (empleado.getEmpresaE().getIdEmp() == id){
            movimientoDinero.setEmpresaM(empresa);
            movimientoDinero.setEmpleadoM(empleado);
            return this.sic.actualizarMovimientoDinero(movimientoDinero);
        }
        else {
            throw new RuntimeException();
        }
    }

    @PatchMapping("/empresas/{id}/movimientos")
    public MovimientoDinero updateMovimientoDinero(@PathVariable Long id, @RequestBody MovimientoDinero movimientoDinero){
        MovimientoDinero movimientoDineroPatch = sic.getMovimientoDineroById(movimientoDinero.getIdMovimiento());
        if (movimientoDineroPatch.getEmpresaM().getIdEmp() == id){
            Empresa empresa = servImpEmpresa.consultarEmpresasPorId(id);
            Empleado empleado;
            if(movimientoDinero.getEmpleadoM() == null){
                empleado = servImpEmpleado.consultarEmpleadosPorId(sic.getMovimientoDineroById(movimientoDinero.getIdMovimiento()).getEmpleadoM().getIdEmpleado());
            } else {
                if (servImpEmpleado.consultarEmpleadosPorId(movimientoDinero.getEmpleadoM().getIdEmpleado()).getEmpresaE().getIdEmp() != id){
                    throw new RuntimeException();
                } else {
                    empleado = servImpEmpleado.consultarEmpleadosPorId(movimientoDinero.getEmpleadoM().getIdEmpleado());
                }
            }
            if (!movimientoDineroPatch.getConcepto().equals(movimientoDinero.getConcepto()) && (movimientoDinero.getConcepto() != null)){
                movimientoDineroPatch.setConcepto(movimientoDinero.getConcepto());
            }
            if ((movimientoDineroPatch.getMonto() != movimientoDinero.getMonto()) && (movimientoDinero.getMonto() != 0 )){
                movimientoDineroPatch.setMonto(movimientoDinero.getMonto());
            }
            movimientoDineroPatch.setEmpleadoM(empleado);
            movimientoDineroPatch.setEmpresaM(empresa);
            return this.sic.actualizarMovimientoDinero(movimientoDineroPatch);
        } else {
            throw new RuntimeException();
        }
    }


}
