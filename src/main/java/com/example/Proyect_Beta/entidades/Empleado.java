package com.example.Proyect_Beta.entidades;

import javax.persistence.*;

@Entity
@Table(name="empleados")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEmpleado;

    @Column(unique = true,nullable = false, length = 40)
    private String correo;
    @Column(nullable = false, length = 40)
    private String nombre;

    @Column()
    private String rol;




    public Empleado()
    {
    }

    public Empleado(long idEmpleado, String correo, String nombre, String rol) {
        this.idEmpleado = idEmpleado;
        this.correo = correo;
        this.nombre = nombre;

        this.rol = rol;
    }

    public long getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}// fin clase Empleado







