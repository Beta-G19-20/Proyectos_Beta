package com.example.Proyect_Beta.entidades;



import javax.persistence.*;
import java.util.List;


@Entity
@Table(name="empleados")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idEmpleado;

    @Column(nullable = false, length = 40)
    private String nombre;

    @Column(nullable = false, length = 40)
    private String correo;

    @Column(nullable = false,length = 30)
    private String rol;

    @ManyToOne
    @JoinColumn(name="id_empresa",referencedColumnName = "idEmp")
    private Empresa empresa;

    public Empleado()
    {
    }

    public Empleado(String nombre, String correo,  String rol, Empresa empresa)
    {
        this.nombre = nombre;
        this.correo = correo;
        this.rol = rol;
        this.empresa=empresa;

    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
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

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
}// fin clase Empleado
