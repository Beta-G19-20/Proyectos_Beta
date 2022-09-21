package com.example.Proyect_Beta.servicios;



import com.example.Proyect_Beta.entidades.Empleado;
import java.lang.*;
import java.util.List;
import java.util.Map;

public interface ServiEmpleado {
    public List<Empleado> listarEmpleados();
    public Empleado guardarEmpleados(Empleado empleado);
    public Empleado consultarEmpleadosPorId(Long idEmpleado);
    public Empleado actualizarEmpleados(Empleado empleado);
    public void eliminarEmpleados(Long idEmpleado);

    public Empleado actEmpleadoId(Long id, Map<Object,Object> objectMap);

    public Empleado consultarEmpleadosId(Long id, Map<Object,Object> objectMap);



}// fin interface
