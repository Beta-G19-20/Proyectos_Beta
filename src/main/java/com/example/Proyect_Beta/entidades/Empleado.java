package com.example.Proyect_Beta.entidades;

import javax.persistence.*;

@Entity
@Table(name="empleados")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEmpleado;

    @Column(nullable = false, length = 40)
    private String nombre;

    @Column(unique = true,nullable = false, length = 40)
    private String correo;

    @Column(nullable = false,length = 30)
    private String empresati;
    @Column()
    private String rol;


    public Empleado()
    {
    }

    public Empleado(Integer idEmpleado, String nombre, String correo, String empresati, String rol) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.correo = correo;
        this.empresati = empresati;
        this.rol = rol;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
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

    public String getEmpresati() {
        return empresati;
    }

    public void setEmpresati(String empresa) {
        this.empresati = empresa;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}// fin clase Empleado







