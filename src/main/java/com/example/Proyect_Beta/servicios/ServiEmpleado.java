package com.example.Proyect_Beta.servicios;



import com.example.Proyect_Beta.entidades.Empleado;

import java.util.List;
import java.util.Map;

public interface ServiEmpleado {
    public List<Empleado> listarEmpleados();
    public Empleado guardarEmpleados(Empleado empleado);
    public Empleado consultarEmpleadosPorId(Integer idEmpleado);
    public Empleado actualizarEmpleados(Empleado empleado);
    public void eliminarEmpleados(Integer idEmpleado);

    public Empleado actEmpleadoId(Integer id, Map<Object,Object> objectMap);

    public Empleado consultarEmpleadosId(Integer id, Map<Object,Object> objectMap);



}// fin interface
