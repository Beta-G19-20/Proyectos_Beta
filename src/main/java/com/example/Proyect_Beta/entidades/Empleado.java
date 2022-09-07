package com.example.Proyect_Beta.entidades;

import javax.persistence.*;

@Entity
@Table(name="empleados")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEmpleado;

    @Column(unique = true,name="concepto",nullable = false, length = 40)
    private String correo;

    @Column(unique = true,name="concepto",nullable = false, length = 40)
    private String correo;

    @Column(unique = true,nullable = false,length = 30,name="empleado")
    private Empleado empleado;

    private String nombre;
    @Column(unique = true,nullable = false,length = 30)
    private String correo;

    @Column()
    private String rol;

public Empleado() {
    }

    public Empleado(String nombre, String correo, String empresa, String rol) {
        this.nombre = nombre;
        this.correo = correo;
        this.empresa = empresa;
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}// fin clase Empleado






}
